package L22_Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class C2_KthSmallestELement {
    public int kthSmallest(int[] arr, int k) {
        // here we are using max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(pq.size() > k)
                pq.remove();
        }

        return pq.peek();
    }
}
