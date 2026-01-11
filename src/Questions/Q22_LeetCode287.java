package Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q22_LeetCode287 {
    public static int findDuplicate(int[] nums) {
        int n = nums.length;
        boolean[] flag = new boolean[n];
        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];
            if(flag[k])
                return k;
            else
                flag[k] = true;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(arr));
    }
}
