package L21_HashMaps_And_HashSets;

import java.util.Arrays;
import java.util.HashMap;

public class C8_ValidAnagram {
    // method 1 : by HashMap
//    public boolean isAnagram(String s, String t) {
//        if(s.length() != t.length())
//            return false;
//
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(Character ch : s.toCharArray())
//            map.put(ch , map.getOrDefault(ch , 0) + 1);
//
//        for(Character ch : t.toCharArray()){
//            if(!map.containsKey(ch))
//                return false;
//
//            int count = map.get(ch);
//            if(count == 1)
//                map.remove(ch);
//            else
//                map.put(ch , count - 1);
//        }
//        return true;
//    }


    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        for (int i = 0; i < s1.length; i++) {
            if(s1[i] != s2[i])
                return false;
        }
        return true;
    }
}
