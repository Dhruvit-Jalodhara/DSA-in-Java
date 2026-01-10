package L09_2DArays;

public class C18_SqMatrixMultiply {
    public static void print(int[][] arr){
        for(int[] a : arr){
            for(int x : a){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int[][] multiply(int[][] a , int[][] b){
        int n = a.length;
        int[][] ans = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    ans[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5,6}, {7,8,9},};
        int[][] b = {{3,2,1}, {6,5,4}, {9,8,7},};


        print(a);
        print(b);
        int[][] ans = multiply(a,b);
        print(ans);
    }
}
