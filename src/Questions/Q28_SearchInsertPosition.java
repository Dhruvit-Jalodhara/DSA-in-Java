package Questions;

//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

public class Q28_SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;

        int start = 0 , end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] < target)
                start = mid + 1;
            else if(nums[mid] > target)
                end = mid - 1;
            else
                return mid;
        }
        return (end + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};

        System.out.println(searchInsert(arr,7));
    }
}
