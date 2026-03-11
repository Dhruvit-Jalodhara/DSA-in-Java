package L19_BinaryTrees;

import java.util.*;

public class C11_BinaryTreePath {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(root , new ArrayList<>() , ans);
        return ans;
    }
    private static void helper(Node root , ArrayList<Integer> list , ArrayList<ArrayList<Integer>> ans){
        if(root == null)
            return;

        list.add(root.value);

        if(root.left == null && root.right == null){
            ans.add(new ArrayList<>(list));
        }else {
            helper(root.left, list, ans);
            helper(root.right, list, ans);
        }

        list.remove(list.size() - 1);
    }
}
