import java.util.Scanner;

public class userInputIntoAnArray {
    public static void main(String[] args){
        // contohSatu();
        contohDua();
    }

    public static String[] contohSatu() {

        Scanner scanner = new Scanner(System.in);

        String[] foods = new String[3]; // Arraynya dapat memuat 3 string

        for(int i = 0; i < foods.length; i++){ // Cycle the loop 3 times because the array could storage 3 strings
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods) {
            System.out.println(food);
        }
        scanner.close();
        return foods;
    }

    public static String[] contohDua() {

        Scanner scanner = new Scanner(System.in);

        String[] foods; // Declare the variable foods
        int size;

        System.out.print("How many food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size]; // Initialize so you can return the variable

        for(int i = 0; i < foods.length; i++){
            System.out.println("Enter a food");
            foods[i] = scanner.nextLine();
        }
         
        scanner.close();
        return foods;
    }
}
