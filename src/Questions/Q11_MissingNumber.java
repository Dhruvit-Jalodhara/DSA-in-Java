package Questions;
// leetcode no : 268
public class Q11_MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * ( n + 1 )) / 2;
        int asum = 0;
        for(int x : nums)
            asum += x;

        return (sum - asum);
    }
    public static void main(String[] args) {

    }
}

