package overloadedConstructor;

public class Main {
    public static void main(String[] args){
        // overloaded constructors = Allow a class to have multiple constructors
        //                           with different parameter lists.
        //                           Enable objects to be initialized in various ways.

        User user1 = new User("Yakitori");

        System.out.println("Username: " + user1.username);
        System.out.println("Email: " + user1.email + "\n");

        User user2 = new User("Yutori", "Yutori@gmail.com");

        System.out.println("Username: " + user2.username);
        System.out.println("Email: " + user2.email);

    }
}
