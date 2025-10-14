public class Array3d{
    public static void main(String[] args){
        int[][] arr2d = {
            {1 ,10}, {2 ,20}, {3, 30}, {4, 40}
        };

        System.out.println(arr2d[1][1]);

        int[][][] arr3d = {
            {
                {1, 10},
                {2, 20}
            }, 
            {
                {3,30},
                {4,40}
            },
            {
                {5,50},
                {6,60}
            }, 
            {
                {7,70},
                {8,80}
            } 
        };

        System.out.println(arr3d[2][0][1] + arr3d[1][0][1]);
    }
}