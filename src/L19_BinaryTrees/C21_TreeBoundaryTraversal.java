package L19_BinaryTrees;

import java.util.ArrayList;

public class C21_TreeBoundaryTraversal {
    public ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null) return ans;

        // Step 1: Add root
        ans.add(root.value);

        // Step 2: Left boundary (excluding root & leaves)
        leftBoundary(root.left, ans);

        // Step 3: Leaf nodes
        leafNodes(root.left, ans);
        leafNodes(root.right, ans);

        // Step 4: Right boundary (excluding root & leaves)
        rightBoundary(root.right, ans);

        return ans;
    }

    private void leftBoundary(Node root, ArrayList<Integer> ans) {
        if (root == null)
            return;

        // Skip leaf nodes
        if (root.left == null && root.right == null)
            return;

        ans.add(root.value);

        if (root.left != null)
            leftBoundary(root.left, ans);
        else
            leftBoundary(root.right, ans);
    }

    private void leafNodes(Node root, ArrayList<Integer> ans) {
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            ans.add(root.value);
            return;
        }

        leafNodes(root.left, ans);
        leafNodes(root.right, ans);
    }

    private void rightBoundary(Node root, ArrayList<Integer> ans) {
        if (root == null)
            return;

        // Skip leaf nodes
        if (root.left == null && root.right == null)
            return;

        if (root.right != null)
            rightBoundary(root.right, ans);
        else
            rightBoundary(root.left, ans);

        // Add after recursion (reverse order)
        ans.add(root.value);
    }

}
