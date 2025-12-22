package practice;

public class MatrixEvenSum {
    public static int evenSum(int[][] matrix){

        // int[][] matrix = {
        //    {1, 2}, -> baris 0
        //    {2, 3}, -> baris 1
        //    {4, 5}  -> baris 2
        //};

        // matrix.length = jumlah baris (m)
        // matrix[i].length = jumlah kolom di baris ke-i (n)

        // Pake 2 loop -> loop luar -> pindah baris | loop dalam -> pindah kolom
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                int angka = matrix[i][j];
                if(angka % 2 == 0){
                    sum += angka;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {2, 2}, 
            {2, 101},
            {4, 5}
        };

        System.out.println(evenSum(matrix));
    }
}
