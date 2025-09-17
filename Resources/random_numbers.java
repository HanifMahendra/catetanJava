import java.util.Random;

public class random_numbers {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        number = random.nextInt(1,100);
        System.out.println(number);

        double value;
        value = random.nextDouble(1,100);
        System.out.println(value);
    }
}
    