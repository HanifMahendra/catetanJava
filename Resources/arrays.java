import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // array = a collection of values of the same data type
        //         think of it as a variable that can store more than 1 value

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        System.out.println(fruits[0]); // Print 'apple' [0] menandakan lokasi variable didalam array
        // [0] -> apple, [1] -> orange, dst
        System.out.println("");


        // Jika ingin print isi semua dalam variable fruits, bisa dengan loop:
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println("");


        for (int x = 0; x < fruits.length; x++) {
            System.out.print(fruits[x] + " ");
        }
        System.out.println("");


        fruits[0] = "pineapple"; // Jika ingin menganti salah satu isi dari array
        System.out.println(fruits[0]);
        System.out.println("");


        int totalOfFruits = fruits.length;
        System.out.println(totalOfFruits); // Untuk cek banyaknya isi dari fruits.
        System.out.println("");


        Arrays.sort(fruits); // sort by alphabets
        for(String fruit : fruits){
            System.out.println(fruit); // Cara lain dalam looping (digunakan untuk test .sort juga)
        }
        System.out.println("");

        Arrays.fill(fruits, "mango"); // Ganti semua elemen array di 'fruits' dengan mango
        for(String fruit : fruits){
            System.out.println(fruit); // Cara lain dalam looping (digunakan untuk test .fill juga)
        }
        System.out.println("");
    }
}
