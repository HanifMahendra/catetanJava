package RuntimePolymorphism;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Runtime polymorphism                = When the method that gets executed is decided
        // (also known as Dynamic Polymorphism)  at runtime based on the actual type of the object.

        Scanner scanner = new Scanner(System.in);

        Animal animal; // Means Animal animal = new Cat/Dog(); -> Base on user input

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();
        
        if(choice == 1){
            animal = new Dog();
            animal.speak(); // Karena new Dog(); -> otomatis manggil fungsi .speak()-nya class Dog
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak(); // Karena new Cat(); -> otomatis manggil fungsi .speak()-nya class Cat
        }

        scanner.close();
    }
}
