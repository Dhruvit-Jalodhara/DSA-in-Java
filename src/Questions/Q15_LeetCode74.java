package Questions;

public class Q15_LeetCode74 {
    public boolean searchMatrix(int[][] arr, int target) {
        int row = arr.length , col = arr[0].length;

        int s = 0 , e = row*col - 1;
        while (s <= e){
            int m = (s+e)/2;
            int mrow = m/col , mcol = m%col;
            if(arr[mrow][mcol] < target)
                s = m + 1;
            else if(arr[mrow][mcol] > target)
                e = m - 1;
            else
                return true;
        }
        return false;
    }
}
