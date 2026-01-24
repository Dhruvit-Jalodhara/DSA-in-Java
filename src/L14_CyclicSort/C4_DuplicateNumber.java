package L14_CyclicSort;

public class C4_DuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIdx = nums[i]-1;
            if(nums[i] == i + 1) {
                i++;
            }
            else{
                if(nums[i] == nums[correctIdx]) return nums[i];

                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            }
        }
        return (nums.length - 1);
    }
}
