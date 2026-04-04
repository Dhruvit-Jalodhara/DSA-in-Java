package L22_Heaps;

import java.util.PriorityQueue;

public class C4_NearlySortedArray {
    public void nearlySorted(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(pq.size() > k){
                arr[idx] = pq.remove();
                idx++;
            }
        }
        while(idx < arr.length)
            arr[idx++] = pq.remove();
    }
}
