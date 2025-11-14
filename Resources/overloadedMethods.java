public class overloadedMethods {
    public static void main(String[] args) {
        // overloaded methods = methods that share the same name,
        //                      but different parameters
        //                      signature = name + parameters

        System.out.println(add(1,2)); // Menggunakan method pertama
        System.out.println(add(1,2,3)); // Menggunakan method kedua
        System.out.println(sub(1,2)); // Menggunakan method ketiga

        String pizza = bakePizza("flat bread");
        System.out.println(pizza);

        String meltedPizza = bakePizza("flat bread", "melted mozzarella");
        System.out.println(meltedPizza);
    }

    static double add(double a, double b){ // Method pertama
        return a + b;
    }

    static double add(double a, double b, double c) { // Method kedua
        return a + b + c;
    }

    // --> PERHATIKAN BAHWA KEDUA METHOD MEMILIKI NAMA YANG SAMA TETAPI DENGAN PARAMETER BERBEDA
    // --> JAVA MEMPERBOLEHKAN HAL SEPERTI INI!

    // --> Jika di Method kedua parameter 'double c' dihapus, akan terjadi error 'method is already defined'
    // --> Karena tidak boleh ada 2 method yang 'copy-paste' (dari segi nama DAN parameter).

    static double sub(double a, double b) {
        if(a > b) {
            return a - b;
        }
        else {
        return b - a;
        }
    }

    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }
}
