package practice;

public class RaggedArrays {

    public static int[][] buildRaggedArraysIncr(int size) {
        int[][] result = new int[size][];
        int value = 0;

        for (int i = 0; i < size; i++) {
            // tiap baris punya i + 1 kolom
            result[i] = new int[i + 1];

            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = value % 10;
                value++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = buildRaggedArraysIncr(5);

        // print ragged array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        // ==========================================================
        System.out.println();
        // ==========================================================

        System.out.print("{");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("{");

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);

                if (j < arr[i].length - 1) {
                    System.out.print(",");
                }
            }

            System.out.print("}");

            if (i < arr.length - 1) {
                System.out.println(", ");
            }
        }

        System.out.println("}");
    }
}
