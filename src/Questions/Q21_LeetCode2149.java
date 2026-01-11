package Questions;

public class Q21_LeetCode2149 {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int pos = 0 , neg = 2;
        for (int i = 0; i < n; i++) {
            if(nums[i] > 0){
                ans[pos*2] = nums[i];
                pos += 2;
            }else{
                ans[neg*2] = nums[i];
                neg += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int[] ans = rearrangeArray(arr);

        for(int x : ans){
            System.out.print(x + " ");
        }
    }
}
