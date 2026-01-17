package L12_Recursion;

public class C13_UniquePaths {
    // method 1 : recursion ( it will give TLE error )
//    public static int uniquePaths(int m, int n) {
//        if(m==1 || n==1)
//            return 1;
//
//        return uniquePaths(m - 1, n) + uniquePaths(m , n -1);
//    }


    // method 2 :
//    public static int uniquePaths(int m, int n) {
//        int[][] grid = new int[m][n];
//
//        for (int i = 0; i < m; i++)
//            grid[i][0] = 1;
//
//        for (int j = 0; j < n; j++)
//            grid[0][j] = 1;
//
//        for (int i = 1; i < m; i++) {
//            for (int j = 1; j < n; j++) {
//                grid[i][j] = grid[i-1][j] + grid[i][j-1];
//            }
//        }
//        return grid[m-1][n-1];
//    }


    // method 3 : by pnc
    public static int uniquePaths(int m, int n) {
        int a = m -1 , b = n -1;

        return nCr(a + b , Math.min(a,b));
    }
    public static int nCr(int n, int r){
        r = Math.min(r, n - r);
        long res = 1;
        for(int i = 1; i <= r; i++){
            res = res * (n - i + 1) / i;
        }
        return (int)res;
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(7,3));
    }
}
