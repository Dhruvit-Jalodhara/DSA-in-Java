package L21_HashMaps_And_HashSets;

// gfg practice

import java.util.Arrays;
import java.util.HashSet;

public class C3_TwoSum {
    // method 1 :
//    boolean twoSum(int arr[], int target) {
//        Arrays.sort(arr);
//        int i = 0 , j = arr.length - 1;
//        while(i < j){
//            if(arr[i] + arr[j] < target)
//                i++;
//            else if(arr[i] + arr[j] > target)
//                j--;
//            else
//                return true;
//        }
//        return false;
//    }

    // method 2 :
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            int rem = target - ele;
            if(set.contains(rem))
                return true;
            else
                set.add(ele);
        }
        return false;
    }
}
