package L14_CyclicSort;

import java.util.*;

//Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice, return an array of all the integers that appears twice.

public class C5_ArrayDuplicates {

    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            int correctIdx = arr[i] - 1;
            if(arr[i] != arr[correctIdx]) {
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
            }else{
                i++;
            }
        }

        for (i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1) ans.add(arr[i]);
        }
        return ans;
    }
}
