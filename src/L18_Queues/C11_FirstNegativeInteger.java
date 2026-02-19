package L18_Queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C11_FirstNegativeInteger {

    // method 1 : Brute force
//    static List<Integer> firstNegInt(int arr[], int k) {
//        List<Integer> ans = new ArrayList<>();
//
//        int i = 0 , j = k - 1;
//        while(j < arr.length){
//
//            int l;
//            for (l = i; l <= j; l++) {
//                if(arr[l] < 0) {
//                    ans.add(arr[l]);
//                    break;
//                }
//            }
//            if(l > j)
//                ans.add(0);
//            i++;
//            j++;
//        }
//
//        return ans;
//    }

    // method 2 :
    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        // Store indices of all negative elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                q.add(i);
        }

        int i = 0, j = k - 1;
        while (j < arr.length) {
            // Remove indices that are out of current window
            while (q.size() > 0 && q.peek() < i) {
                q.remove();
            }

            if (q.size() > 0 && q.peek() <= j) {
                ans.add(arr[q.peek()]);
            } else {
                ans.add(0);
            }

            i++;
            j++;
        }
        return ans;
    }

}
