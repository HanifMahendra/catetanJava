package arrayOfObjects;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("Charger", "Yellow");

        Car[] cars = {car1, car2, car3};

        // This for loop is
        for(int i = 0; i < cars.length; i++){
            cars[i].drive();
        }

        System.out.println();

        // Same as this for-each loop
        for(Car car : cars){
            car.drive();
        }

        System.out.println();

        // You can use the array like this to
        Car[] many_car = {new Car("Corvette", "Black"),
                          new Car("Charger", "Yellow"),
                          new Car("Mustang", "Black")};

        for(Car car : many_car){
            car.drive();
        }

        System.out.println();

        // If you want to change the color of each car in the array.
        for(Car car : many_car){
            car.color = "Black";
        }

        // To print the changes colors
        for(Car car : many_car){
            car.drive();
        }
    }
}
