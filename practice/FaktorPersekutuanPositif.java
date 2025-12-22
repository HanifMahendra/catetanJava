package practice;

public class FaktorPersekutuanPositif {
    
    public static int jumlahFaktorPersekutuanPositif(int a, int b, int c){

        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);

        int min = Math.min(a, Math.min(b, c));

        int jumlah = 0;

        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i == 0 && c % i == 0){
                jumlah += i;
            }
        }
        return jumlah;
    }

    public static void main(String[] args) {
        System.out.println(jumlahFaktorPersekutuanPositif(10, -20, 15));
    }
}
