package streamApi;

import java.util.List;
import java.util.stream.Collectors;

// Class untuk model data (Best practice: Bisa di file terpisah, tapi kita gabung
// di sini agar cuma ada 2 file)
class Karyawan {
    private String nama;
    private int usia;
    private String departemen;

    public Karyawan(String nama, int usia, String departemen) {
        this.nama = nama;
        this.usia = usia;
        this.departemen = departemen;
    }

    public int getUsia() { 
        return usia; 
    }

    public String getDepartemen() { 
        return departemen; 
    }

    public String getNama() { 
        return nama; 
    }
    
    @Override
    public String toString() {
        return nama + " (" + departemen + ", " + usia + ")";
    }
}

// Class utama yang berisi semua metode Stream
public class StreamProcessor {
    
    // Metode untuk Demonstrasi .filter()
    public static void demoFilter(List<Karyawan> daftarKaryawan) {
        System.out.println("--- 1. DEMO: .filter() (Penyaringan) ---");
        
        // Tugas: Cari Karyawan dari departemen 'IT' yang usianya di bawah 30.
        List<Karyawan> itMuda = daftarKaryawan.stream()
            // Intermediate 1: Filter Departemen IT
            .filter(k -> k.getDepartemen().equals("IT"))
            // Intermediate 2: Filter Usia < 30
            .filter(k -> k.getUsia() < 30)
            
            // Terminal Operation
            .collect(Collectors.toList());
        
        System.out.println("Karyawan IT Muda: " + itMuda);
    }
    
    // Metode untuk Demonstrasi .map()
    public static void demoMap(List<Karyawan> daftarKaryawan) {
        System.out.println("\n--- 2. DEMO: .map() (Transformasi) ---");
        
        // Tugas: Ambil semua nama karyawan dan ubah ke huruf kapital.
        List<String> namaKapital = daftarKaryawan.stream()
            // Intermediate Operation: .map()
            // Mengubah Karyawan objek menjadi String (Nama) lalu ke UPPERCASE
            .map(k -> k.getNama().toUpperCase()) 
            
            // Terminal Operation
            .collect(Collectors.toList());
            
        System.out.println("Daftar Nama Kapital: " + namaKapital);
    }
    
    // Metode untuk Demonstrasi Terminal Operations (.count, .forEach, .collect)
    public static void demoTerminal(List<Karyawan> daftarKaryawan) {
        System.out.println("\n--- 3. DEMO: Terminal Operations ---");
        
        // .count(): Hitung jumlah karyawan Sales
        long jumlahSales = daftarKaryawan.stream()
            .filter(k -> k.getDepartemen().equals("Sales"))
            .count(); // Terminal Operation yang menghasilkan nilai tunggal
        
        System.out.println("Jumlah Karyawan Sales: " + jumlahSales);
        
        // Gabungan Filter, Map, dan forEach
        System.out.println("Nama dan Usia Karyawan HR:");
        daftarKaryawan.stream()
            .filter(k -> k.getDepartemen().equals("HR"))
            .map(k -> k.getNama() + " (" + k.getUsia() + " tahun)")
            .forEach(System.out::println); // Terminal Operation yang melakukan aksi
    }
}