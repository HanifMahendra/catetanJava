package enumerations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Enums = (Enumerations) A special kind of class that
        //         represents a fixed set of constants.
        //         They improve code readability and are easy to maintain.
        //         More efficient with switches when comparing Strings.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        Day day = Day.valueOf(response);
        // Di enumerations, cara lain untuk menulis 'Day day = new Day(1);'
        // adalah 'Day day = Day.MONDAY;'

        System.out.println(day); // output: SUNDAY
        System.out.println(day.getDayNumber()); // output: 1

        // Enum helpful in switch case.
        switch(day){
            case MONDAY -> System.out.println("It is a weekday");
            case TUESDAY -> System.out.println("It is a weekday");
            case WEDNESDAY -> System.out.println("It is a weekday");
            case THURSDAY -> System.out.println("It is a weekday");
            case FRIDAY -> System.out.println("It is a weekday");
            case SATURDAY -> System.out.println("It is a weekend");
            case SUNDAY -> System.out.println("It is a weekend");
        }

        scanner.close();
    }
}
