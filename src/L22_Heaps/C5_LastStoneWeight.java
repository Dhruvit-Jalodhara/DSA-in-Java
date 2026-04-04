package L22_Heaps;

import java.util.*;

// leetcode 1046

public class C5_LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1)
            return stones[0];

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : stones)
            pq.add(ele);

        while(pq.size() > 1){
            int y = pq.remove();
            int x = pq.remove();
            int remain = y - x;
            if(remain != 0)
                pq.add(remain);
        }

        if(pq.size() > 0)
            return pq.peek();
        else
            return 0;
    }
}
