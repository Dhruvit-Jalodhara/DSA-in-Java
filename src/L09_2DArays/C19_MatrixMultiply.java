package L09_2DArays;

public class C19_MatrixMultiply {
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
        int[][] ans = new int[a.length][b[0].length];

        if(a[0].length != b.length) {
            System.out.println("enter valid matrices !!!");
            return ans;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    ans[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};
        int[][] b = {{1,2,3,10},{4,5,6,11},{7,8,9,12}};

        print(a);
        print(b);
        int[][] ans = multiply(a,b);
        print(ans);
    }
}
