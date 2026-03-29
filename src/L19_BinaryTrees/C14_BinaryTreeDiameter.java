package L19_BinaryTrees;

public class C14_BinaryTreeDiameter {
    int max;
    public int diameterOfBinaryTree(Node root) {
        if (root == null)
            return 0;

        max = 0;              // stores maximum diameter
        levels(root);         // compute heights + update diameter
        return max;
    }
    private int levels(Node root) {
        if (root == null)
            return 0;

        // get height of left and right subtree
        int leftLevel = levels(root.left);
        int rightLevel = levels(root.right);

        // update diameter (longest path through this node)
        max = Math.max(max, leftLevel + rightLevel);

        // return height of current node
        return 1 + Math.max(leftLevel, rightLevel);
    }
}
