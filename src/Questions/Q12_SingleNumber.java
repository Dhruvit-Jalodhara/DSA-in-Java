package Questions;
// leetcode no : 136
public class Q12_SingleNumber {
    public int singleNumber(int[] nums) {
        // ^(xor)
        // a ^ a = 0
        // a ^ 0 = a
        int ans = 0;
        for(int x : nums){
            ans ^= x;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}

