package arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // ArrayList = A resizeable array that stores objects (autoboxing).
        //             Arrays are fixed in size, but ArrayLists can change.

        ArrayList<String> fruits = new ArrayList<>();

        // To add element to the array.
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        fruits.remove(0); // To remove element in specific index in the array
        fruits.add(0, "Apple"); // To add element in specific index in the array
        fruits.set(0, "Pineapple"); // Replace element in index 0 with Pineapple

        System.out.println(fruits);
        System.out.println(fruits.get(0)); // To get an element in the specific index
        System.out.println(fruits.size()); // Biar tau ukuran arraylistnya berapa.

        Collections.sort(fruits); // To sort the arraylist
        System.out.println(fruits); // Print the sorted arraylist

        // Kalo mau print isi arraylist dengan new line:
        for (String fruit : fruits){ // Pake for-each loop
            System.out.println(fruit);
        }

    }
}
