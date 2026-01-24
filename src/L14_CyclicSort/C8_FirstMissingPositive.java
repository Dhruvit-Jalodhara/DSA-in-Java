package L14_CyclicSort;

// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums. Leetcode No : 41


import java.util.Arrays;

public class C8_FirstMissingPositive {
    public static int firstMissingPositive(int[] arr) {
        int i = 0 , n = arr.length;
        while(i < arr.length){
            int correctIdx = arr[i] - 1;

            if(arr[i] > 0 && arr[i] < n && arr[i] != arr[correctIdx]){
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
            }else{
                i++;
            }
        }
        int num = 1;
        for (i = 0; i < arr.length; i++) {
            if(num == arr[i])
                num++;
            else
                continue;
        }
        return num;
    }
}
