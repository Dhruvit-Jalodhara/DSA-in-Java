package L09_2DArays;

public class C01_InitilizationOf2DArray {
    public static void main(String[] args) {

        // method 1 :
        int[][] arr1 = new int[3][2]; // {{0,0},{0,0},{0,0}}
        System.out.println(arr1.length); // rows of matrix
        System.out.println(arr1[0].length); // cols of matrix


        // method 2 :
        int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr2.length); // rows of matrix
        System.out.println(arr2[0].length); // cols of matrix
    }
}
