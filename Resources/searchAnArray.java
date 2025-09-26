public class searchAnArray {
    public static void main(String[] args){
        contohInteger();
        contohString();
    }
    public static int[] contohInteger(){

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int target = 2;
        boolean isFound = false;

        for(int i = 0; i < numbers.length; i ++){
            if(target == numbers[i]){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break; // If we found the target, get out of the loop
            }
        }

        if(!isFound){
            System.out.println("Element not found in the array!");
        }
        return numbers;
    }

    public static String[] contohString(){
        String[] fruits = {"apple", "orange", "banana"};
        String target = "orange";
        boolean isFound = false;

        for(int i = 0; i < fruits.length; i ++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break; // If we found the target, get out of the loop
            }
        }

        if(!isFound){
            System.out.println("Element not found in the array!");
        }
        return fruits;
    }
}
