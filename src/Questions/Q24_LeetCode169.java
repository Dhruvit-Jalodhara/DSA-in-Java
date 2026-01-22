package Questions;

import java.util.Arrays;

public class Q24_LeetCode169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maxCount = 0 , majorNum = nums[0] , count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    majorNum = nums[i - 1];
                }
                count = 1;
            }
        }
        if (count > maxCount) {
            majorNum = nums[nums.length - 1];
        }

        return majorNum;
    }
}
