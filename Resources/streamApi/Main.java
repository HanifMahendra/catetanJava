package streamApi;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("     ----- STREAM API LEARNING -----     ");
        System.out.println("=========================================");

        // Inisialisasi data di Main.java
        List<Karyawan> daftarKaryawan = Arrays.asList(
            new Karyawan("Andi", 35, "HR"),
            new Karyawan("Budi", 28, "Sales"),
            new Karyawan("Citra", 24, "IT"),
            new Karyawan("Doni", 40, "HR"),
            new Karyawan("Eka", 31, "IT"),
            new Karyawan("Fany", 27, "Sales")
        );
        
        // Panggil semua metode demonstrasi dari StreamProcessor.java
        StreamProcessor.demoFilter(daftarKaryawan);
        StreamProcessor.demoMap(daftarKaryawan);
        StreamProcessor.demoTerminal(daftarKaryawan);
    }
}