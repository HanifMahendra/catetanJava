package inheritance;

public class Main {
    public static void main(String[] args){
        // Inheritance = One class inherits the attributes and methods
        //               from another class.
        //               Child <- Parent
        
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);

        dog.eat();
        cat.eat();
        plant.photosynthesize();
    }
}
