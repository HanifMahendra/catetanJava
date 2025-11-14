public class varargs {
    public static void main(String[] args){
        // varargs (variable arguments) = allow a method to accept a varying # of arguments
        //                                makes methods more flexible, no need for overload methods
        //                                java will pack the arguments into an array
        //                                ... (ellipsis) -> how to use varargs

        System.out.println(add(1, 2, 3, 4));
        System.out.println(add(1, 2, 3, 4, 5, 6));

        System.out.println(name("Hanif ", "Awiyoso ", "Mahendra"));
    }

    public static int add(int... numbers) {
        int sum = 0;

        for(int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static String name(String... names) {
        String s = "";

        for(String name : names) {
            s += name;
        }
        
        return s;
    }
}
