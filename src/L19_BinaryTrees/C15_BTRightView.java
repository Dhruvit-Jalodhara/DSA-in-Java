package L19_BinaryTrees;

import java.util.*;

// LeetCode no : 199
public class C15_BTRightView {
    // method 1 :
//    public List<Integer> rightSideView(Node root) {
//        int[] arr = new int[levels(root)];
//        helper(root , 0 , arr);
//
//        List<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            ans.add(arr[i]);
//        }
//        return ans;
//    }
//    private int levels(Node root){
//        if(root == null)
//            return 0;
//
//        return 1 + Math.max(levels(root.left) , levels(root.right));
//    }
//    private void helper(Node root , int level , int[] arr){
//        if(root == null)
//            return;
//
//        arr[level] = root.value;
//        helper(root.left , level+1 , arr);
//        helper(root.right , level+1 , arr);
//    }

    // method 2 :
    public List<Integer> rightSideView(Node root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, 0, ans);
        return ans;
    }
    private void dfs(Node root, int level, List<Integer> ans) {
        if (root == null) return;

        // first node at this level
        if (level == ans.size())
            ans.add(root.value);

        // visit right first
        dfs(root.right, level + 1, ans);
        dfs(root.left, level + 1, ans);
    }
}
