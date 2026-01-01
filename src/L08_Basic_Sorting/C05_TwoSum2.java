package L08_Basic_Sorting;

import java.util.Arrays;

public class C05_TwoSum2 {
    public static boolean twoSum(int[] nums, int target) {
        Arrays.sort(nums); // time = n*log(n) , space = n
        int i = 0 , j = nums.length - 1;

        while(i < j){
            if(nums[i] + nums[j] > target) j--;
            else if (nums[i] + nums[j] < target) i++;
            else return true;
        }

        return false;
    }
    public static void main(String[] args) {

    }
}

