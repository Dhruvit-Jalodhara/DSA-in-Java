package L12_Recursion;

import java.util.*;

public class C22_GenerateParenthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n,"",0,0,ans);
        return ans;
    }
    public static void helper(int n,String str , int left , int right , List<String> ans){
        if(right == n){
            ans.add(str);
            return;
        }

        if(left < n)
            helper(n, str + "(", left + 1, right, ans);
        if(right < left)
            helper(n, str + ")", left, right + 1, ans);
    }
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
