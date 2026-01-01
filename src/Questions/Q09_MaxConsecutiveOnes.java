package Questions;

// LeetCode no : 485
public class Q09_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0,ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 1){
                if(count > ans)
                    ans = count;
                count = 0;
            }
            else
                count++;
        }
        if(count > ans) return count;
        return ans;
    }
    public static void main(String[] args) {

    }
}

