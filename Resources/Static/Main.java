package Static;

public class Main {
    public static void main(String[] args) {

        // static = Makes a variable or method belong to the class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Yakitori");
        Friend friend2 = new Friend("Yutori");

        System.out.println("Friend 1st: " + friend1.name);
        System.out.println("Friend 2nd: " + friend2.name);
        System.out.println("Output of total friends in variable 'friend1': " + friend1.numOfFriends); // Yang ini ga static, jadi cuman output: 1, karena parameter "friend1" itu parameter kecil, DAN di atas hanya ada 1 parameter ini yang di assign.
        System.out.println("Output of total friends in variable 'Friend': " + Friend.totalFriends); // Kalo static, dia harus assign parameter "besarnya" -> dan disini outputnya: 2. Karena parameter "besar" ini ada 2 parameter "kecil".

        System.out.print("Using 'Friend' parameter, ");
        Friend.showFriends(); // static method (Can't use print because, static can't merge with non static)
    }
}
