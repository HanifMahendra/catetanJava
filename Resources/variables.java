public class variables {
    public static void main(String[] args) {

        // variable = a reusable container for a value
        //            a variable behaves as if it was the value it contains

        // Primitive = simple value stored directly in memory (stack)
        // Reference = memory address (stack) that points to the (heap)

        // Primitive vs Reference
        // ---------    ---------
        // int          string
        // double       array
        // char         object
        // boolean

        // 2 Steps to creating a varible
        // -----------------------------
        // 1. declaration
        // 2. assignment

        // Primitive
        int age; // declaration
        age = 19; // assignment
        // You can just write "int age = 19;"
        System.out.println(age);

        double GPA = 3.5;
        System.out.println(GPA);

        char grade = 'A';
        System.out.println(grade);

        boolean pass = true;
        System.out.println("Did yutori pass Java? " + pass);

        // References
        String name = "Yutori";
        System.out.println("What is your name? " + name);

        

    }
}