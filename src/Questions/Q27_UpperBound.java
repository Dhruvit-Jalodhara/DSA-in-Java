package Questions;

public class Q27_UpperBound {
    public int upperBound(int[] nums, int x) {
        int ans = -1;
        int start = 0 , end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] <= x) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}
