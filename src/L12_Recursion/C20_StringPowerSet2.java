package L12_Recursion;

import java.util.*;

// here we have used the property of string (pass by copy)

public class C20_StringPowerSet2 {
    public static List<String> AllPossibleStrings(String s) {
        List<String> ans = new ArrayList<>();
        helper(s, 0, "", ans);
        Collections.sort(ans); // sort lexicographically
        return ans;
    }

    public static void helper(String s, int idx, String temp, List<String> ans) {
        if (idx == s.length()) {
            if (temp.length() != 0) ans.add(temp);
            return;
        }
        char ch = s.charAt(idx);
        helper(s, idx + 1, temp + ch, ans); // pick current character
        helper(s, idx + 1, temp, ans); // exclude current character
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(AllPossibleStrings(str));
    }
}
