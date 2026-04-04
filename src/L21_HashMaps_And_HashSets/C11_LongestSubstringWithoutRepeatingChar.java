package L21_HashMaps_And_HashSets;

import java.util.HashMap;
import java.util.HashSet;

public class C11_LongestSubstringWithoutRepeatingChar {
//    public int lengthOfLongestSubstring(String s) {
//        if(s.length() == 0)
//            return 0;
//
//        HashSet<Character> set = new HashSet<>();
//        int max = 0 , i = 0 , j = 0;
//        while(i < s.length() && j < s.length()){
//            char ch = s.charAt(j);
//            if(set.contains(ch)){
//                max = Math.max(max, j - i);
//                while(s.charAt(i) != s.charAt(j)) {
//                    set.remove(s.charAt(i));
//                    i++;
//                }
//                i++;
//                j++;
//            }else{
//                set.add(ch);
//                j++;
//            }
//        }
//
//        max = Math.max(max, j - i);
//
//        return max;
//    }

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int max = 0 , i = 0;

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);

            //If duplicate found inside current window
            if (map.containsKey(ch) && map.get(ch) >= i) {
                i = map.get(ch) + 1;  // move left pointer
            }

            map.put(ch, j);

            max = Math.max(max, j - i + 1);
        }

        return max;
    }
}
