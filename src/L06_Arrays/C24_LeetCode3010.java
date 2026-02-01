package L06_Arrays;

import java.util.Arrays;

public class C24_LeetCode3010 {
//    public int minimumCost(int[] nums) {
//        int n = nums.length;
//        int firstElement = nums[0];
//
//        int[] rest = Arrays.copyOfRange(nums, 1, n);
//        Arrays.sort(rest);
//
//        return firstElement + rest[0] + rest[1];
//    }

    public int minimumCost(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];
            if (x < first) {
                second = first;
                first = x;
            } else if (x < second) {
                second = x;
            }
        }
        return nums[0] + first + second;
    }
}
