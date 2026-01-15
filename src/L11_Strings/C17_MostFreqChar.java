package L11_Strings;

import java.util.Arrays;
import java.util.Collections;

public class C17_MostFreqChar {
    // Method 1 : Brute force
//    public static char getMaxOccuringChar(String s) {
//        int n = s.length();
//        int maxCount = 1;
//        char ans = s.charAt(0);
//        for (int i = 0; i < n; i++) {
//            int count = 1;
//            char ch = s.charAt(i);
//            for (int j = i+1; j < n; j++) {
//                if(s.charAt(j) == ch)
//                    count++;
//            }
//            if(count > maxCount){
//                maxCount = count;
//                ans = ch;
//            } else if (count == maxCount && ch < ans) {
//                ans = ch;
//            }
//        }
//        return ans;
//    }


    // Method 2 :
//    public static char getMaxOccuringChar(String s) {
//        char[] arr = s.toCharArray();
//        Arrays.sort(arr);
//        char ans = s.charAt(0);
//        int maxcount = -1 , i = 0 , j = 0;;
//        while(j < s.length()){
//            if(arr[i] == arr[j]){
//                j++;
//            }else {
//                int len = j -i;
//                if(len > maxcount){
//                    maxcount = len;
//                    ans = arr[i];
//                }
//                i = j;
//            }
//        }
//        int len = j -i;
//        if(len > maxcount){
//            maxcount = len;
//            ans = arr[i];
//        }
//        return ans;
//    }

    // Method 3 : Best
    public static char getMaxOccuringChar(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            freq[idx]++;
        }
        int max = -1;
        char ans = s.charAt(0);
        for (int i = 0; i < 26; i++) {
            if(freq[i] > max){
                max = freq[i];
                ans = (char) (i+'a');
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "testsample";
        System.out.println(getMaxOccuringChar(s));
    }
}
