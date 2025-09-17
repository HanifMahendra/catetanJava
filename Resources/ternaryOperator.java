public class ternaryOperator {
    public static void main(String[] args) {
        // ternary operator "?" = Return 1 of 2 values if a condition is true

        // Formula:
        // variable = (condition) "?" ifTrue : ifFalse;

        int score = 70;

        // NORMALNYA SEPERTI INI:
        if(score >= 55) {
            System.out.println("You PASS!!");
        }
        else {
            System.out.println("You FAIL!");
        }

        // Jika memakai ternary operator tinggal gini:

        String passOrFail = (score >= 55) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

        // -----------------------------------------------------------------------

        int number = 3;

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(evenOrOdd);

        // -----------------------------------------------------------------------

        int hours = 13;

        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        System.out.println(timeOfDay);

        // -----------------------------------------------------------------------

        int income = 60000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println("Your tax rate is: " + taxRate);
    }
}
