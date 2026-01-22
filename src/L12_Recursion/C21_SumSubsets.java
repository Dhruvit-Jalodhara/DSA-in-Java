package L12_Recursion;

import java.util.*;

public class C21_SumSubsets {
    public static ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(arr, 0, new ArrayList<>(), ans);
        return ans;
    }
    public static void helper(int[] arr, int idx, ArrayList<Integer> temp, ArrayList<Integer> ans) {

        if (idx == arr.length) {
            int sum = 0;
            for (int i = 0; i < temp.size(); i++) {
                sum += temp.get(i);
            }
            ans.add(sum);
            return;
        }
        // pick element
        temp.add(arr[idx]);
        helper(arr, idx + 1, temp, ans);

        temp.remove(temp.size() - 1); //  backtracking

        // skip element
        helper(arr, idx + 1, temp, ans);
    }
    public static void main(String[] args) {
        int[] arr = {2,3};
        System.out.println(subsetSums(arr));
    }
}
