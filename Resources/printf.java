public class printf {
    public static void main(String[] args) {

        // prinf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        String name = "Yutori";
        char firstLetter = 'Y';
        int age = 19;
        double height = 178.5;
        boolean isStudent = true;

        System.out.printf("Hello %s\n", name); // Buat string
        System.out.printf("Your name starts with a %c\n", firstLetter); // Buat char
        System.out.printf("You are %d years old\n", age); // Buat integer
        System.out.printf("You are %.2f cm tall\n", height); //%f buat double | //.2f buat 2 angka diblkg koma
        System.out.printf("Are you a student? %b\n", isStudent); // Buat boolean

        // flags

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price = 50.00;
        double discount = -10.00;
        double save = 10.00;
        double comma = 1000000.99;
        System.out.printf("The price is %.2f dollars\n", price);
        System.out.printf("The discount is % .2f dollars\n", discount); // % .2f untuk menambahkan tanda minus jika variable negatif
        System.out.printf("You save %+.2f dollars\n", save); // %+.2f untuk menambahkan + didepan doublenya
        System.out.printf("This one display a comma: %,.2f\n", comma);

        // width

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%03d\n", id2);
        System.out.printf("%9d\n", id3);
        System.out.printf("%-4d\n", id4);

    }
    
}
