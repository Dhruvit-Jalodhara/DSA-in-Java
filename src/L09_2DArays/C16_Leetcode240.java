package L09_2DArays;

public class C16_Leetcode240 {
    //method 1
//    public static boolean searchMatrix(int[][] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            boolean ans = false;
//            if(arr[i][0] <= target && arr[i][arr[0].length-1] >= target)
//                ans = Bs(arr,target,i);
//
//            if(ans)
//                return true;
//        }
//        return false;
//    }
//    public static boolean Bs(int[][] arr, int target , int  row){
//        int s = 0 , e = arr[0].length - 1;
//        while (s <= e){
//            int m = (s + e) / 2;
//            if(arr[row][m] < target) s = m + 1;
//            else if(arr[row][m] > target) e = m - 1;
//            else return true;
//        }
//        return false;
//    }
    
    
    // method 2
    public static boolean searchMatrix(int[][] arr, int target){
        int rows = arr.length;
        int cols = arr[0].length;
        
        int i = 0 , j = cols - 1;
        while(i < rows && j >= 0){
            if(arr[i][j] < target)
                i++;
            else if (arr[i][j] > target)
                j--;
            else
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(searchMatrix(arr,20));
    }
}
