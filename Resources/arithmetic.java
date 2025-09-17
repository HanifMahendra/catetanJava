public class arithmetic {
    public static void main(String[] args) {
        // Arithmetic Operators
        int x = 1;
        

        // Increment and Decrement Operators
        x += 1; // x = x + 1 -> 2
        x -= 1; // x = x - 1 -> 1
        x++; // x + 1 -> 2
        x--; // x - 1 -> 1

        System.out.println(x);

        // ORDER OF OPERATIONS [P-E-M-D-A-S]

        double result = 10 + 10 * (2-1) / 2;
        System.out.println(result);
    }
}
