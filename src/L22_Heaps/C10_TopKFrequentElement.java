package L22_Heaps;

import java.util.*;

public class C10_TopKFrequentElement {
    static class Pair implements Comparable<Pair>{
        int value;
        int freq;

        public Pair(int value, int freq) {
            this.value = value;
            this.freq = freq;
        }

        public int compareTo( Pair p) {
            return this.freq - p.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();  // <element,frequency>

        for(int x : nums)
            map.put(x , map.getOrDefault(x , 0) + 1);

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int x : map.keySet()){
            int value = x;
            int freq = map.get(x);

            pq.add(new Pair(x,freq));

            if(pq.size() > k)
                pq.remove();
        }
        int[] ans =  new int[pq.size()];
        for (int i = 0; i < ans.length; i++) {
            Pair p = pq.remove();
            ans[i] = p.value;
        }
        return ans;
    }
}
