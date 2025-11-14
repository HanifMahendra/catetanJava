package gettersetter;

public class Main {
    public static void main(String[] args){
        System.out.println(); // Biar enak bacanya, kasih space diawal

        // They help protect data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Car car =  new Car("Charger", "Yellow", 10000);

        // Tes SETTER:
        car.setColor("Black");
        car.setPrice(-5000); // Because the conditional statements equal to false, the price didn't change.
        car.setPrice(7500); // Because the conditional statement equal to true, the price did change.
        car.setModel("Corvette");
        // If you want the 'model' can't be change, change the declaration to 'private final String model;'
        // also delete the SETTER of Model, and delete the implementation of the SETTER (So you get no errors).

        System.out.println("The price of " + car.getColor() + " " + car.getModel() + " is $" + car.getPrice());
    }
}
