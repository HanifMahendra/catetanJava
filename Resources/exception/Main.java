package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exception = An event that interrupts the normal flow of a program
        //             (Dividing by zero, file not found, mismatch input type)
        //             Surround any dangerous code with a try{} block
        //             try{}, catch{}, finally{}

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number/0);
        }
        catch(InputMismatchException e){ // Mismatch in the datatype
            System.out.println("THAT WASN'T A NUMBER");
        }

        catch(ArithmeticException e) {
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        }
        // SAFETY NET - lebih baik taruh di akhir catch
        catch(Exception e){
            System.out.println("Something went wrong!"); // Tidak disarankan menggunakan ini, karena tidak best-practice
        }

        // Finally{} will always be execute, either there is catch or not.
        // Finally{} is optional.
        finally{
            // Misal ketika sudah open file, lalu ingin menaruh close file, dapat ditaruh didalam finally{}
            // Misal ketika sudah Scanner, lalu ingin menutup scanner, dapat ditaruh didalam finally{}
            scanner.close();
            System.out.println("This always execute");
        }
    }
}
