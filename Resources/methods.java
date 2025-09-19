public class methods {
    public static void main(String[] args) {
        // method = a block of reusable code that is executed when called()

        String name = "Yutori";
        happyBirthday(name);

        double result = testResult(10);
        System.out.println("Your test result is: " + result);

    }

    static void happyBirthday(String name){ // Jika sebuah method ingin memakai variable diluar method tersebut, tambahkan variablenya ke parameternya
        System.out.println("Happy Birthday " + name);
    }

    static double testResult(double number) {
        return number * 10;
    }
}
