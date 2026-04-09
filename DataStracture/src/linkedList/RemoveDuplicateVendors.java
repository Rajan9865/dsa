package linkedList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 2/26/2026
 */
public class RemoveDuplicateVendors {
    public static void main(String[] args) throws Exception {
//
//        BufferedReader br = new BufferedReader(new FileReader("D:\\zipfile\\vendor1.csv"));
//        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\zipfile\\vendor12.csv"));
        String file1 = args.length > 0 ? args[0] : "D:\\zipfile\\vendor1.csv";
        String file2 = args.length > 1 ? args[1] : "D:\\zipfile\\vendor12.csv";
        BufferedReader br = new BufferedReader(new FileReader(file1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
        String header = br.readLine();
        bw.write(header);
        bw.newLine();

        String previousVendor = "";
        String line;

        while ((line = br.readLine()) != null) {

            String[] columns = line.split(",", -1);

            String vendor = columns[0].trim();
            String material = columns.length > 1 ? columns[1] : "";
            String scName = columns.length > 2 ? columns[2] : "";

            if (vendor.equals(previousVendor)) {
                bw.write("," + material + "," + scName);
            } else {
                bw.write(vendor + "," + material + "," + scName);
                previousVendor = vendor;
            }

            bw.newLine();
        }

        br.close();
        bw.close();

        System.out.println("vendor12.csv created successfully with formatted data!");
    }
}