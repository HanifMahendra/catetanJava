public class breakAndContinue {
    public static void main(String[] args) {
        // break = break out of a loop (STOP)
        // continue = skip currentn iteration of a loop (SKIP)

        for(int i = 0; i < 10; i++) {

            if(i== 5) {
                continue; // SKIP number 5 and from 4 directly print to 6
            }
            if (i == 7) {
                break; // STOPS when it reach 7
            }
            System.out.print(i + " ");
        }
    }
}
