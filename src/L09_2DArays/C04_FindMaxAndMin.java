package L09_2DArays;

public class C04_FindMaxAndMin {
    public static int findMax(int[][] arr){
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        return max;
    }
    public static int findMin(int[][] arr){
        int min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] < min)
                    min = arr[i][j];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(findMax(arr));
        System.out.println(findMin(arr));
    }
}
