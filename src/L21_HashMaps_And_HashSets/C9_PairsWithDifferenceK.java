package L21_HashMaps_And_HashSets;

import java.util.HashMap;

public class C9_PairsWithDifferenceK {
    int countPairs(int[] arr, int k) {

        // Create frequency map
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : arr)
            map.put(x , map.getOrDefault(x,0) + 1);

        int pairs = 0;

        // Traverse unique elements of map
        for(int ele : map.keySet()){

            // Possible pair candidates
            int rem1 = ele - k;
            int rem2 = ele + k;

            // Check for (ele - k)
            if(map.containsKey(rem1))
                // multiply frequencies → counts all combinations
                pairs += map.get(rem1) * map.get(ele);

            // Check for (ele + k)
            if(map.containsKey(rem2))
                pairs += map.get(rem2) * map.get(ele);
        }

        // Divide by 2 to adjust double counting
        // because each pair is counted twice:
        // (a,b) and (b,a)
        pairs /= 2;

        return pairs;
    }
}
