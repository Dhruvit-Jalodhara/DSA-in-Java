package L19_BinaryTrees;

import java.util.*;

public class C19_PathSum2 {
    public List<List<Integer>> pathSum(Node root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, targetSum, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void helper(Node root, int target, int sum, List<Integer> temp, List<List<Integer>> ans) {

        if (root == null)
            return;

        sum += root.value;
        temp.add(root.value);

        if (sum == target && root.left == null && root.right == null) {
            ans.add(new ArrayList<>(temp));
        }

        helper(root.left, target, sum, temp, ans);
        helper(root.right, target, sum, temp, ans);

        temp.remove(temp.size() - 1);
    }
}
