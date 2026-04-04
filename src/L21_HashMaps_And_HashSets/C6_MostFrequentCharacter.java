package L21_HashMaps_And_HashSets;

import java.util.*;

public class C6_MostFrequentCharacter {

    public char getMaxOccuringChar(String s) {
        if(s.length() == 1)
            return s.charAt(0);

        HashMap<Character , Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char result = s.charAt(0);  // safer default
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                result = ch;
            }
            else if (count == maxCount && ch < result) {
                result = ch;
            }
        }

        return result;
    }

//    public char getMaxOccuringChar(String s) {
//
//        HashMap<Character, Integer> map = new HashMap<>();
//        char result = '{';
//        int maxCount = 0;
//
//        for (char ch : s.toCharArray()) {
//            int count = map.getOrDefault(ch, 0) + 1;
//            map.put(ch, count);
//
//            if (count > maxCount || (count == maxCount && ch < result)) {
//                maxCount = count;
//                result = ch;
//            }
//        }
//
//        return result;
//    }


    // method 2 :
//    public char getMaxOccuringChar(String s) {
//
//        int[] freq = new int[26];
//
//        for (char ch : s.toCharArray()) {
//            freq[ch - 'a']++;
//        }
//
//        int maxCount = 0;
//        char result = 'a';
//
//        for (int i = 0; i < 26; i++) {
//
//            if (freq[i] > maxCount) {
//                maxCount = freq[i];
//                result = (char)(i + 'a');
//            }
//            else if (freq[i] == maxCount && (char)(i + 'a') < result) {
//                result = (char)(i + 'a');
//            }
//        }
//
//        return result;
//    }
}
