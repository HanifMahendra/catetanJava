package Static;

public class Friend {
    static int totalFriends;
    int numOfFriends;
    String name;

    Friend(String name){
        this.name = name;
        numOfFriends++;
        totalFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + totalFriends + " total friends"); // Kalo static, gabutuh this.(variable) -> contoh: this.totalFriends harus ditulis 'totalFriends' saja.
    }
}
