package objectOrientedProgramming;

public class Car {
    
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }

    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }

    void drive(){
        isRunning = true;
        System.out.println("You driving the " + model);
    }

    void brake(){
        isRunning = true;
        System.out.println("You hit the brake on the " + model);
    }
}
