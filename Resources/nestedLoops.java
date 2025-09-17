public class nestedLoops {
    public static void main(String[] args) {
        // nested loop = A loop inside another loop
        //               Used often with matrices or DS&A

        for(int i = 1; i <= 3; i++) { // Yang ini declare berapa kali loop yang didalemnya mau dilakuin (Yang ini ngeprint angka 1-9 sebanyak 3 kali)
            for (int j = 1; j <= 9; j++) { // Print angka 1-9
                System.out.print(j + " "); // Perhatikan bahwa yang di print j , akan beda hasilnya jika yang di print 'i'
            }
            System.out.println(); // Biar setiap kali print angka 1-9, akan ada 'enter' biar loop ke berikutnya di line yang baru
        }

        for(int i = 1; i <= 2; i++) { // Print angka 1 di line pertama, dan 2 di line kedua
            for (int j = 1; j <= 4; j++) { // declare mau berapa kali si 'i' di print
                System.out.print(i + " "); 
            }
            System.out.println();
        }

        System.out.println(" ");

        // Gambar segitiga siku-siku atas kiri

        for(int i = 1; i <= 5; i++) {
            for(int j = 6; j > i; j--) {
                System.out.print('*' +" ");
            }
            System.out.println();
        }
    }
}
