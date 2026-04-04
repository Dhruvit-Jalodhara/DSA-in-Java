package L21_HashMaps_And_HashSets;

import java.util.Arrays;
import java.util.HashSet;

public class C2_CountDistinctElement {

    // method 1 : best
    public int distinctElement(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr)
            set.add(num);

        return set.size();
    }

    // method 2 :
//    public int distinctElement(int[] arr) {
//        if (arr.length == 0) return 0;
//
//        int count = 1;
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length - 1; i++) {
//            if(arr[i] != arr[i + 1])
//                count++;
//        }
//        return count;
//    }
}
