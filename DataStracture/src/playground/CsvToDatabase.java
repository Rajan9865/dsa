package playground;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.text.SimpleDateFormat;

public class CsvToDatabase {

    private static final String DB_URL =
            "jdbc:mysql://localhost:3306/super2"
                    + "?useUnicode=true"
                    + "&characterEncoding=UTF-8"
                    + "&serverTimezone=UTC"
                    + "&allowPublicKeyRetrieval=true"
                    + "&useSSL=false";

    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";

    private static final String CSV_FILE =
            "C:\\Users\\lenovo\\Downloads\\new_rdss_wo\\TN-605\\vendor_setw_mat_schedule_tn_605.csv";

    private static final int BATCH_SIZE = 500;

    static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        String insertQuery =
                "INSERT INTO vendor_setw_mat_schedule ("
                        + "wo_mat_map_ai_id,"
                        + "delivery_sch_days,"
                        + "delivery_sch_date,"
                        + "delivery_sch_unit,"
                        + "delivery_sch_qty,"
                        + "created_at,"
                        + "created_by,"
                        + "updated_at,"
                        + "updated_by,"
                        + "is_active,"
                        + "is_deleted,"
                        + "parent_delivery_sch_id,"
                        + "is_double_delivery,"
                        + "ctl_delivery_sch_ai_id,"
                        + "vend_flag,"
                        + "deff_ai_id"
                        + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        int totalInserted = 0;
        int csvRows = 0;
        int skippedRows = 0;

        try (
                Connection conn = DriverManager.getConnection(
                        DB_URL,
                        DB_USERNAME,
                        DB_PASSWORD);

                BufferedReader br = new BufferedReader(
                        new FileReader(CSV_FILE));

                PreparedStatement ps =
                        conn.prepareStatement(insertQuery)
        ) {

            conn.setAutoCommit(false);

            String line;
            int lineNumber = 0;

            // Skip Header
            br.readLine();
            lineNumber++;

            while ((line = br.readLine()) != null) {

                lineNumber++;

                // Skip completely blank lines
                if (line.trim().isEmpty()) {
                    skippedRows++;
                    System.out.println(
                            STR."Skipping Empty Line : \{lineNumber}");
                    continue;
                }

                String[] data = line.split(",", -1);

                // Skip rows like:
                // ,,,,,,,,,,,,,,,,,
                if (isBlankRow(data)) {
                    skippedRows++;
                    System.out.println(
                            STR."Skipping Blank Row : \{lineNumber}");
                    continue;
                }

                if (data.length < 17) {

                    skippedRows++;

                    System.out.println(
                            STR."Skipping Invalid Row : \{lineNumber} Column Count : \{data.length}");

                    continue;
                }

                csvRows++;

                ps.setLong(1, parseLong(data[1]));
                ps.setInt(2, parseInt(data[2]));

                setTimestampOrNull(ps, 3, data[3]);

                ps.setString(4, emptyToNull(data[4]));
                ps.setDouble(5, parseDouble(data[5]));

                if (isEmpty(data[6])) {

                    ps.setTimestamp(
                            6,
                            new Timestamp(
                                    System.currentTimeMillis()));

                } else {

                    setTimestampOrNull(ps, 6, data[6]);
                }

                ps.setLong(7, parseLong(data[7]));

                setTimestampOrNull(ps, 8, data[8]);

                ps.setLong(9, parseLong(data[9]));

                ps.setString(
                        10,
                        defaultValue(data[10], "Y"));

                ps.setString(
                        11,
                        defaultValue(data[11], "N"));

                ps.setLong(12, parseLong(data[12]));
                ps.setInt(13, parseInt(data[13]));
                ps.setLong(14, parseLong(data[14]));

                ps.setString(
                        15,
                        cleanVendFlag(data[15]));

                ps.setLong(16, parseLong(data[16]));

                ps.addBatch();

                if (csvRows % BATCH_SIZE == 0) {

                    int[] result =
                            ps.executeBatch();

                    conn.commit();

                    totalInserted += result.length;

                    System.out.println(
                            STR."Inserted : \{totalInserted}");

                    ps.clearBatch();
                }
            }

            int[] remaining =
                    ps.executeBatch();

            conn.commit();

            totalInserted += remaining.length;

            ps.clearBatch();

            System.out.println("\n==============================");
            System.out.println(STR."CSV Rows Processed : \{csvRows}");
            System.out.println(STR."Rows Inserted      : \{totalInserted}");
            System.out.println(STR."Rows Skipped       : \{skippedRows}");
            System.out.println("==============================");

            System.out.println(
                    "Import Completed Successfully");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    private static boolean isBlankRow(String[] data) {

        for (String value : data) {

            if (value != null
                    && !value.trim().isEmpty()) {

                return false;
            }
        }

        return true;
    }

    private static boolean isEmpty(String value) {

        return value == null
                || value.trim().isEmpty()
                || "NULL".equalsIgnoreCase(
                value.trim());
    }

    private static Long parseLong(String value) {

        return isEmpty(value)
                ? 0L
                : Long.parseLong(value.trim());
    }

    private static Integer parseInt(String value) {

        return isEmpty(value)
                ? 0
                : Integer.parseInt(value.trim());
    }

    private static Double parseDouble(String value) {

        return isEmpty(value)
                ? 0.0
                : Double.parseDouble(value.trim());
    }

    private static String emptyToNull(String value) {

        return isEmpty(value)
                ? null
                : value.trim();
    }

    private static String defaultValue(
            String value,
            String defaultValue) {

        return isEmpty(value)
                ? defaultValue
                : value.trim();
    }

    private static String cleanVendFlag(
            String value) {

        if (isEmpty(value)) {
            return null;
        }

        value =
                value.replace("\"", "")
                        .trim();

        return value.length() > 1
                ? value.substring(0, 1)
                : value;
    }

    private static void setTimestampOrNull(
            PreparedStatement ps,
            int index,
            String value)
            throws Exception {

        if (isEmpty(value)) {

            ps.setNull(
                    index,
                    Types.TIMESTAMP);

            return;
        }

        value =
                value.replace("\"", "")
                        .trim();

        Timestamp timestamp;

        try {

            timestamp =
                    Timestamp.valueOf(value);

        } catch (Exception e1) {

            try {

                SimpleDateFormat sdf =
                        new SimpleDateFormat(
                                "M/d/yyyy H:mm");

                timestamp =
                        new Timestamp(
                                sdf.parse(value)
                                        .getTime());

            } catch (Exception e2) {

                SimpleDateFormat sdf =
                        new SimpleDateFormat(
                                "M/d/yyyy H:mm:ss");

                timestamp =
                        new Timestamp(
                                sdf.parse(value)
                                        .getTime());
            }
        }

        ps.setTimestamp(index, timestamp);
    }
}