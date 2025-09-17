public class logicalOperators {
    public static void main(String[] args) {
        // && = AND
        // || = OR
        // ! = NOT

        double temp = 20;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is Sunny outside");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is Cloudy outside");
        }
        else if(temp > 30 || temp < 0) {
            System.out.println("The weather is bad");
        }
    }
}
