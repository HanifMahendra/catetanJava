package practice;

public class Mul3or5 {
    
    public static int sumOfMultiples(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 10; // Example input
        System.out.println("Sum of multiples of 3 or 5 below " + number + " is: " + sumOfMultiples(number));
    }
}
