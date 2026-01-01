package Questions;

import java.util.Arrays;

public class Q14_TwoSum {
    public static boolean twoSum(int[] nums, int target) {
        // method 1
//        int[] ans = new int[2];
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    ans[0] = i;
//                    ans[1] = j;
//                    break;
//                }
//            }
//        }
//
//        return ans;

        // method 2
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

