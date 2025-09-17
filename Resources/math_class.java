import java.util.Scanner;

public class math_class {
    public static void main(String[] args) {
        System.out.println(Math.PI); // Pi number
        System.out.println(Math.E); // Euler number

        double result;
        result = Math.pow(2,10); // 2 pangkat 10
        result = Math.abs(-5); // absolute number of -5 (absolute = positive)
        result = Math.sqrt(9); // The square root of 9 -> 3
        result = Math.round(3.14); // Round a number to the nearest integer number
        result = Math.ceil(3.14); // Round up a number
        result = Math.floor(3.99); // Round down the number
        result = Math.max(10,20); // Print the highest number
        result = Math.min(10,20); // Print the smallest number
        System.out.println(result);

        // HYPOTENUSE c = Math.sqrt(a^2 + b^2)
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("The hypotenuse (c) is: " + c + "cm");

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius,2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        System.out.println("The circumference is: " + circumference + "cm");

        area = Math.PI * Math.pow(radius,2);
        System.out.println("The area is: " + area + "cm^2");
 
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume is: " + volume);

        scanner.close();
    }
    
}
