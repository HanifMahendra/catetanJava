package Polymorphism;

public class Main {
    public static void main(String[] args) {
        
        // Polymorphism = "POLY" -> "MANY"
        //                "MORPH" -> "SHAPE"
        //                Objects can identify as other objects.
        //                Objects can be treated as objects of a common superclass.

        // Polymorphism can also be achieve through using Interfaces.

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat}; // Kalau mau buat array 3 class tersebut digabung, gunakan Parent class sebagai arraynya.
        
        for(Vehicle vehicle : vehicles){ // For every vehicle in this array of vehicles
            vehicle.go();
        }
    }
}
