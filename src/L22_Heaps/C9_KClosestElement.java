package L22_Heaps;

// Leetcode 658

import java.util.*;

public class C9_KClosestElement {

    // method 1 : by heap
//    static class Pair implements Comparable<Pair>{
//        int value;
//        int dis;
//
//        public Pair(int value, int dis) {
//            this.value = value;
//            this.dis = dis;
//        }
//
//        public int compareTo(Pair p) {
//            if(this.dis == p.dis)
//                return this.value - p.value;
//            return this.dis - p.dis;
//        }
//    }
//    public List<Integer> findClosestElements(int[] arr, int k, int x) {
//        ArrayList<Integer> ans = new ArrayList<>();
//
//        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
//
//        for(int ele : arr){
//            pq.add(new Pair(ele , Math.abs(ele - x)));
//
//            if(pq.size() > k)
//                pq.poll();
//        }
//
//        while(pq.size() > 0)
//            ans.add(pq.poll().value);
//
//        Collections.sort(ans);
//
//        return ans;
//    }


    // method 2 : by binary search
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int low = 0;
        int high = arr.length - k;

        while (low < high) {
            int mid = (low + high) / 2;

            if (x - arr[mid] > arr[mid + k] - x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = low; i < low + k; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}
