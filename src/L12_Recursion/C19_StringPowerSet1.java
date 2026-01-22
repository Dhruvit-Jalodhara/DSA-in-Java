package L12_Recursion;

import java.util.*;

// here we have used the property of StringBuilder (pass by reference)

public class C19_StringPowerSet1 {

    public static List<String> AllPossibleStrings(String s) {
        List<String> ans = new ArrayList<>();
        helper(s, 0, new StringBuilder(), ans);
        Collections.sort(ans);                 // sort lexicographically
        return ans;
    }

    public static void helper(String s, int idx, StringBuilder current, List<String> ans) {

        // Base case: reached end of string
        if (idx == s.length()) {
            if (current.length() > 0)
                ans.add(current.toString());  // store non-empty string
            return;
        }

        current.append(s.charAt(idx)); //pick current character

        helper(s, idx + 1, current, ans);

        current.deleteCharAt(current.length() - 1); // Backtrack (remove last char)

        helper(s, idx + 1, current, ans); // skip current character
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(AllPossibleStrings(str));
    }
}
