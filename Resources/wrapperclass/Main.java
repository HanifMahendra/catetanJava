package wrapperclass;

public class Main {
    public static void main(String[] args){
        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object
        //                   Allows use of Collections Framework and static Utility Methods.

        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        // Unboxing
        int w = a;
        double x = b;
        char y = c;
        boolean z = d;

        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z + "\n");

        // If you want to change any datatype to String.
        String e = Integer.toString(123);
        String f = Double.toString(3.14);
        String g = Character.toString('$');
        String h = Boolean.toString(false);

        String i = e + f + g + h;
        System.out.println(i + "\n");

        // Parsing
        int j = Integer.parseInt("123");
        double k = Double.parseDouble("3.14");
        char l = "Pizza".charAt(0); // char don't have parse method, use this instead. 
        boolean m = Boolean.parseBoolean("true");

        // Can't add them together into 1 output, because different datatypes.
        // Instead, do this:
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m + "\n");

        // Another wrapper class to know if the input is letter or not
        char letter = 'B'; // If you use '$' it will output 'false' because '$' is not a letter.
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
    }
}
