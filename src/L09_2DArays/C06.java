package L09_2DArays;


// Find the minimum element out of all the maximum elements of each row

public class C06 {
    public static int minOfMax(int[][] arr){
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            int max = arr[i][0];

            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] > max)
                    max = arr[i][j];
            }

            if(ans > max)
                ans = max;

        }

        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(minOfMax(arr));
    }
}
