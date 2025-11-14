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

    // NOTES:
    // static void -> TIDAK PERLU RETURN APA-APA
    // singkatnya, kayak main(String[] args), bedanya
    // biar kode jalan, method si 'static void ini' harus dipanggil di
    // method 'main' (String[] args).
    
    static void sayHello() {
        System.out.println("Hello!");
        System.out.println("Tidak perlu return!");
    }

    // static double -> HARUS return double

    static double getAge() {
        return 19;
    }

    // static int -> HARUS return int

    static int getYear() {
        return 2006;
    }

    // static String -> HARUS return String

    static String getName() {
        return "Yutori";
    }

    // static boolean -> HARUS return true atau false

    static boolean isStudent(double age) {
        return age >= 18;
        // TRUE jika age >= 18 -> pernyataan awalnya 'true'
        // FALSE jika age < 18 -> kalo ternyata syaratnya salah maka 'false'
    }
}
