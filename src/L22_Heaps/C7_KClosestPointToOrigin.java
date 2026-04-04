package L22_Heaps;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class C7_KClosestPointToOrigin {
    static class Triplet implements Comparable<Triplet>{
        int disSq;
        int x;
        int y;

        public Triplet(int dis, int x, int y) {
            this.disSq = dis;
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(@NotNull Triplet o) {
            return this.disSq - o.disSq;
        }
    }
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int[] point : points){
            int x = point[0];
            int y = point[1];

            int disSq = x*x + y*y; // distance from origin

            pq.add(new Triplet(disSq,x,y));
            if(pq.size() > k)
                pq.remove();
        }

        for (int i = 0; i < k; i++) {
            Triplet t = pq.remove();
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(t.x);
            temp.add(t.y);
            ans.add(temp);
        }
        return ans;
    }
}
