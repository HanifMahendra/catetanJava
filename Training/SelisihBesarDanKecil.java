public class SelisihBesarDanKecil {
    public static int Hitungan(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        return max - min;

    }

    public static void main(String[] args) {
        System.out.println("Large Difference : " + Hitungan(new int[]{10, 3, 5, 6}));
        System.out.println("Large Difference : " + Hitungan(new int[]{7, 2, 10, 9}));
        System.out.println("Large Difference : " + Hitungan(new int[]{2, 10, 7, 2}));

    }

}
