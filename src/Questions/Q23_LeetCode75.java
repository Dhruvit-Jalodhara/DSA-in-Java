package Questions;

public class Q23_LeetCode75 {
    public void sortColors(int[] nums) {
        int start = 0 , mid = 0 , end = nums.length - 1;
        while(mid <= end){
            if(nums[mid] == 0){
                swap(nums,start,mid);
                start++;
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums,end,mid);
                end--;
                mid++;
            }else {
                mid++;
            }
        }
    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
