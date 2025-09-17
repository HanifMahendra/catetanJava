import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? "); // println = nulisnya dibawah, print = nulisnya di line yang sama
        String name = scanner.nextLine(); // nextLine = detect space and print the next variable ,
                                          // next = didnt detect space and only print the first variable
        
        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        System.out.print("What is your GPA? ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false)");
        boolean student = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("So you are " + age + " years old!");
        System.out.println("Nice, having " + gpa + " GPA is good!");
        System.out.println("Student: " + student);

        scanner.close(); // Wajib ada untuk scanner
    }
}
