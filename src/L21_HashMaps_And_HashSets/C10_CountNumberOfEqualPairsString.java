package L21_HashMaps_And_HashSets;

// GFG : count number of equal pairs in string

import java.util.HashMap;

public class C10_CountNumberOfEqualPairsString {
    long equalPairs(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch :s.toCharArray())
            map.put(ch , map.getOrDefault(ch,0) + 1);

        long pairs = 0;
        for(char ch : map.keySet()){
            pairs += (long) map.get(ch) * map.get(ch);
        }

        return pairs;
    }
}
