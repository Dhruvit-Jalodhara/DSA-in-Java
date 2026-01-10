package L09_2DArays;

public class C13_RotateImage {
    public static void print(int[][] arr){
        for(int[] a : arr){
            for(int x : a){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void transpose(int[][] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void reverseRow(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int s = 0 , e = arr[0].length-1;
            while(s <= e){
                int temp = arr[i][s];
                arr[i][s] = arr[i][e];
                arr[i][e] = temp;
                s++;
                e--;
            }
        }
    }
    public static void rotate(int[][] matrix) {
        transpose(matrix);
        reverseRow(matrix);
    }
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4},{7,2,1,6},{5,5,4,1},{3,1,8,2}};
        print(arr);
        rotate(arr);
        print(arr);
    }
}
