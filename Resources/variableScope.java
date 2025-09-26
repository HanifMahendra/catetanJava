public class variableScope {
    public static void main(String[] args) {
        // variable scope = where a variable can be accessed.

        // there's two different type of scope:
        // 1. Local = a variable declared inside of a method
        // 2. Class

        // ======= LOCAL ========
        int x = 1;
        System.out.println(x);

        doSomething(); // Jalanin method doSomething();
        testClassScope();
    }

    static void doSomething() {
        int x = 2; // Local scope
        System.out.println(x);
    }

    // ======= CLASS =========
    static int x = 3; // Class Scope
    // Kalau print 'x' di method lain, tetapi di method itu tidak ada variable 'x' maka akan print
    // isi variable 'x' yang ada di sini (class scope).

    // Contoh:
    static void testClassScope() {
        System.out.println(x);
    }

    // Kalau di sebuah method ada Local scopenya dan diluar method ada class scopenya
    // Dalam pemanggilan variable tsb, Java akan prioritaskan 'local scopenya' dibanding 'class scopenya'
}
