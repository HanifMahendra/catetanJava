public class switchCase {
    public static void main(String[] args) {
        // Enchanced switch (Switch case) = A replacement to many if else statements

        String day = "Monday";

        switch(day){
            case "Monday" -> System.out.println("It is a weekday!");
            case "Tuesday" -> System.out.println("It is a weekday!");
            case "Wednesday" -> System.out.println("It is a weekday!");
            case "Thursday" -> System.out.println("It is a weekday!");
            case "Friday" -> System.out.println("It is a weekday!");
            case "Saturday" -> System.out.println("It is a weekend!");
            case "Sunday" -> System.out.println("It is a weekend!");
            default -> System.out.println(day + " is not a day!");

            // Jika dilihat, monday-friday akan print string yang sama. Maka jika ingin menghemat line bisa dilakukan dengan:
            // case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday!");
        }
    }
}
