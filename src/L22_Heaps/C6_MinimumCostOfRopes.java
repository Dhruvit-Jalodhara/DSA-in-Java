package L22_Heaps;

import java.util.PriorityQueue;

public class C6_MinimumCostOfRopes {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int ele : arr)
            pq.add(ele);

        int cost = 0;
        while(pq.size() > 1){
            int x = pq.remove();
            int y = pq.remove();

            int sum = x + y;
            cost += sum;
            pq.add(sum);
        }

        return cost;
    }
}
