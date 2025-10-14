import java.util.Scanner;

public class ChangeMatriksNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ukuran matriks (n x n): ");
        int n = scanner.nextInt();

        int[][] matriks = new int[n][n];
        System.out.println("Masukkan elemen-elemen matriks: ");
        for (int y = 0; y < n; y++) { // x dan y itu diambil dari garis koordinat (y dari atas kebawah berarti y)
            for (int x = 0; x < n; x++) {
                matriks[y][x] = scanner.nextInt();
            }
        }

        // Matriks jadi Segitiga Atas
        for (int y = 1; y < n; y++) { 
            for (int x = 0; x < y; x++) {
                matriks[y][x] = 0;
            }
        }

        // Contoh data awal (anggap indeks mulai dari 0):
        // y\x   x0 x1 x2 x3
        //  y0   1  2  3  4
        //  y1   5  6  7  8
        //  y2   9  1  2  3
        //  y3   4  5  6  7

        // Proses per baris:
        // y = 1 -> x = 0         ⇒ matriks[1][0] = 0
        // y = 2 -> x = 0,1       ⇒ matriks[2][0] = 0, matriks[2][1] = 0
        // y = 3 -> x = 0,1,2     ⇒ matriks[3][0] = 0, matriks[3][1] = 0, matriks[3][2] = 0

        // Hasil akhir:
        // y\x   x0 x1 x2 x3
        //  y0   1  2  3  4
        //  y1   0  6  7  8
        //  y2   0  0  2  3
        //  y3   0  0  0  7

        // Print Matriks Segitiga Atas
        System.out.println("Matriks Segitiga Atas:");
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                System.out.print(matriks[y][x] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}