package java8.concept;

import java.io.File;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 4/7/2026
 */
public class DiskSpaceExample {
    public static void main(String[] args) {
        File cDrive = new File("C:\\");

        long total = cDrive.getTotalSpace();
        long free = cDrive.getFreeSpace();
        long usable = cDrive.getUsableSpace();

        System.out.println("Total Space (GB): " + total / (1024.0 * 1024 * 1024));
        System.out.println("Free Space (GB): " + free / (1024.0 * 1024 * 1024));
        System.out.println("Usable Space (GB): " + usable / (1024.0 * 1024 * 1024));
    }
}
