public class array2d {
    public static void main(String[] args) {
        // 2D Array = An array where each element is an array
        //            Useful for storing a matrix of data

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {fruits, vegetables, meats};

        groceries[0][0] = "mango"; // ganti baris ke-0, kolom ke-0 menjadi mango
        groceries[1][0] = "celery"; // ganti baris ke-1, kolom ke-0 menjadi celery

        for(String[] foods : groceries) {
            for(String food : foods){
                System.out.print(food + " ");    
            }
            System.out.println();
        }
    }
}