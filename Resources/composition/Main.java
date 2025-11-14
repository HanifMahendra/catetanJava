package composition;

public class Main {
    public static void main(String[] args){
        // Composition = Represent a "part-of" relationship between objects.
        //               For example, an Engine is "part of" a Car.
        //               Allows complex objects to be constructed from smaller objects.

        Car car = new Car("Corvette",2025,"V8"); // You need this to access the engine.

        System.out.println(car.model);
        System.out.println(car.year);

        // THIS IS THE COMPOSITION
        System.out.println(car.engine.type); // To access certain variable from other files in the same package

        car.start();
    }
    
}
