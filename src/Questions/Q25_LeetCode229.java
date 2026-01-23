package Questions;

import java.util.*;

public class Q25_LeetCode229 {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        int i = 0 , j = 0;
        while(j < n){
            if(nums[i] == nums[j]){
                j++;
            }else{
                int count = j - i;
                if(count > n/3)
                    ans.add(nums[i]);
                i = j;
            }
        }
        int count = j - i;
        if(count > n/3)
            ans.add(nums[i]);

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,3};

        System.out.println(majorityElement(arr));
    }
}
