import java.util.Scanner;

public class MatriksX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input ukuran matriks
        System.out.print("Masukkan ukuran matriks (n): ");
        int n = sc.nextInt();

        // Inisialisasi dan input matriks
        int[][] matriks = new int[n][n];
        System.out.println("Masukkan elemen matriks:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriks[i][j] = sc.nextInt();
            }
        }

        // Ubah elemen diagonal utama dan sekunder menjadi 0
        for (int i = 0; i < n; i++) {
            matriks[i][i] = 0; // Diagonal utama
            matriks[i][n - 1 - i] = 0; // Diagonal sekunder
        }

        // Output hasil
        System.out.println("Matriks setelah dibentuk X:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
