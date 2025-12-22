package practice;

public class DuaBujurSangkar {
    
    public static String statusDuaBujurSangkar(int x1, int y1, int ukuran, int x2,int y2){

        // Bujur Sangkar Biru
        int leftB = 0;
        int rightB = x2;
        int bottomB = 0;
        int topB = y2;

        // Bujur Sangkar Merah
        int rightR = x1;
        int topR = y1;
        int leftR = x1 - ukuran;
        int bottomR = y1 - ukuran;

        // 1. Terpisah
        if(rightR < leftB || leftR > rightB || bottomR > topB || topR < bottomB){
            return "Terpisah";
        }

        // 2. Di dalam
        if(leftB < leftR && rightB > rightR && bottomB < bottomR && topB > topR){
            return "Di dalam";
        }
        return "Beririsan";
    }

    public static void main(String[] args) {
        System.out.println(statusDuaBujurSangkar(1, 3, 2, 4, 4));
    }
}
