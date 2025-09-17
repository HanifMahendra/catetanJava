import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // while loop = repeat some code forever while some condition remains true
        
        String name = "";
        while(name.isEmpty()) { // Selama variable name kosong -> bisa jadi karena di enter doang saat input -> Maka akan loop bertanya sampai variablenya tidak kosong.
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);

        while(!name.equalsIgnoreCase("Yutori")) {
            System.out.println("Your must use 'Yutori' as your nickname!");
            System.out.print("Enter your nickname: ");
            name = scanner.nextLine();
        }

        int age = 0;

        System.out.print("How old are you? ");
        age = scanner.nextInt();

        while(age < 0) {
            System.out.println("How are you typing if your age is below 0!");
            System.out.print("Enter your real age: ");
            age = scanner.nextInt();
        }
        System.out.println("You are " + age + " years old");

        int year = 0;
        System.out.print("Enter your birth year: ");
        year = scanner.nextInt();
        do {
            System.out.println("How are you coding if you a newborn!");
            System.out.print("Enter your birth year: ");
            year = scanner.nextInt();
        }
        while(year == 2025);

        System.out.println("You are born in " + year);

        scanner.close();
    }
}
