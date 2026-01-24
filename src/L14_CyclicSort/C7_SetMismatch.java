package L14_CyclicSort;

//You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

public class C7_SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int i = 0;
        while(i < nums.length){
            int coorectIdx = nums[i] - 1;
            if(nums[i] != nums[coorectIdx]){
                int temp = nums[i];
                nums[i] = nums[coorectIdx];
                nums[coorectIdx] = temp;
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                ans[0] = nums[j];
                ans[1] = j + 1;
            }
        }
        return ans;
    }
}
