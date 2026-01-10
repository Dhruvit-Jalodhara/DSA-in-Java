package L09_2DArays;

public class C05_RowColSum {
    public static void colSum(int[][] arr){
        int ans = 0 , colNo = -1;
        for (int i = 0; i < arr[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            if(ans < sum){
                ans = sum;
                colNo = i;
            }
        }
        System.out.println("max sum = " + ans + " in col no : " + colNo);
    }
    public static void rowSum(int[][] arr){
        int ans = 0 , rowNo = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            if(ans < sum){
                ans = sum;
                rowNo = i;
            }
        }
        System.out.println("max sum = " + ans + " in row no : " + rowNo);
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rowSum(arr);
        colSum(arr);
    }
}
