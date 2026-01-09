package L09_2DArays;

public class C05_RowColSum {
    public static int colSum(int[][] arr){
        int ans = 0;
        for (int i = 0; i < arr[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            if(ans < sum) ans = sum;
        }
        return ans;
    }
    public static int rowSum(int[][] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            if(ans < sum) ans = sum;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(rowSum(arr));
        System.out.println(colSum(arr));
    }
}
