package L06_Arrays;

//Find the doublet in the Array whose sum is equal to the given value x. (Two Sum)

//LeetCode no : 1
public class C10_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }

        return ans;
    }


    public static void main(String[] args) {

    }
}

