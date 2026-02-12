package L17_Stacks;

// leetcode 496

public class C13_NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nextGreater(nums1[i] , nums2);
        }
        return ans;
    }
    private int nextGreater(int k , int[] nums2){
        int ans = -1;
        boolean target = false;
        for (int i = 0; i < nums2.length; i++) {
            if(nums2[i] == k)
                target = true;
            else if(target && nums2[i] > k){
                ans = nums2[i];
                break;
            }
        }
        return ans;
    }
}
