public class Stars {
    public static String[] towerStars(int nFloors){

        String[] tower = new String[nFloors];

        for (int i = 1; i <= nFloors; i++){
            int stars = 2 * i -1;
            int space = nFloors - i;

            String floor = " ".repeat(space) + "*".repeat(stars) + " ".repeat(space);
            tower[i - 1] = floor;
        }
        return tower;
    }

    public static void main(String[] args){
        for (String floor : towerStars(6)) {
            System.out.println(floor);
        }
    }
}
