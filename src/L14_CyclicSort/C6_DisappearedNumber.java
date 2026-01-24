package L14_CyclicSort;

//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

import java.util.*;

public class C6_DisappearedNumber {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIdx = arr[i] - 1;
            if(arr[i] != arr[correctIdx]){
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!= j + 1)
                ans.add(j+1);
        }
        return ans;
    }
}
