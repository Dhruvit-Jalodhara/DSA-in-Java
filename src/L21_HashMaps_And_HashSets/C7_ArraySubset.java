package L21_HashMaps_And_HashSets;

import java.util.HashMap;

public class C7_ArraySubset {

    // wheter b is subset of a
    public boolean isSubset(int[] a, int[] b) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int x : a)
            map.put(x , map.getOrDefault(x,0) + 1);

        for(int num : b){
            if (!map.containsKey(num))
                return false;  // element not present

            int count = map.get(num);
            if (count == 1)
                map.remove(num);
            else
                map.put(num, count - 1);
        }
        return true;
    }
}
