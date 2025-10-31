package methodOverriding;

public class Fish extends Animal{

    @Override // Biar tau aja kalau method ini override, sistem bakal langsung tau karena prioritas child class lebih tinggi drpd parent class. Tetapi terkadang manusia lupa :)
    void move(){
        System.out.println("This animal is swimming");
    }

    // Kalau methodnya typo atau berbeda dengan parent class, dan diatas method tersebut terdapat "@Override" maka sistem akan menganggap "@Override" tsb error.
    // Contoh:

//    @Override -> Di anggap error karena method "moves" tidak ada di parent class!
    void moves(){
        System.out.println("This animal is swimming");
    }
    
}
