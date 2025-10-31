package Interface;

public class Main {
    public static void main(String[] args) {
        
        // Interface = A blueprint for a class that specifies a set of abstract methods
        //             that implementing classes MUST define.
        //             Supports multiple inheritance-like behavior.

        // The difference between Interface and abstract classes:
        // - You can implement more than 1 interface.
        // Ex: Fish can have 2 child class -> BigFish (implements Predator) and SmallFish (implements Prey)

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt(); 
        
        // Both of these method is from Fish.java (different from above)
        fish.flee();
        fish.hunt();
    }
}
