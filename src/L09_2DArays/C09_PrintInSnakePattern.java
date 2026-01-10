package L09_2DArays;

public class C09_PrintInSnakePattern {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};

        // method 1:
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if(j == -1){
                for (j= 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for (j= arr[0].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();

        //method 2:
        j = -1;
        for (int i = 0; i < arr.length; i++) {
            if(j == -1){
                for (j= 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for (j= arr[0].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
