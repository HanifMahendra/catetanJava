package practice;

public class WajikAngka {

    public static void cetakWajikAngka(int ukuran) {

        // Matriks untuk menyimpan angka
        int[][] grid = new int[ukuran][ukuran];

        int angka = 0;

        // =========================
        // 1. ISI ANGKA SECARA ZIG-ZAG
        // =========================
        for (int col = 0; col < ukuran; col++) {

            // Jika kolom GENAP → isi dari ATAS ke BAWAH
            if (col % 2 == 0) {
                for (int row = 0; row < ukuran; row++) {
                    grid[row][col] = angka % 10;
                    angka++;
                }
            }
            // Jika kolom GANJIL → isi dari BAWAH ke ATAS
            else {
                for (int row = ukuran - 1; row >= 0; row--) {
                    grid[row][col] = angka % 10;
                    angka++;
                }
            }
        }

        // =========================
        // 2. CETAK DALAM BENTUK WAJIK
        // =========================
        int tengah = ukuran / 2;

        for (int i = 0; i < ukuran; i++) {

            // Hitung jarak baris dari tengah
            int jarak = Math.abs(i - tengah);

            // Jumlah angka yang dicetak di baris ini
            int jumlahAngka = ukuran - 2 * jarak;

            // Cetak spasi di depan
            for (int s = 0; s < jarak; s++) {
                System.out.print(" ");
            }

            // Cetak angka dari matriks
            for (int j = 0; j < jumlahAngka; j++) {
                System.out.print(grid[i][j + jarak]);
            }

            // Pindah baris
            System.out.println();
        }
    }

    // =========================
    // MAIN (UNTUK TEST)
    // =========================
    public static void main(String[] args) {
        cetakWajikAngka(7);
    }
}
