package L19_BinaryTrees;

public class C14_BinaryTreeDiameter {
    int max;
    public int diameterOfBinaryTree(Node root) {
        if(root == null)
            return 0;

        max = 0;
        levels(root);
        return max;
    }
    private int levels(Node root){
        if(root == null)
            return 0;

        int leftLevel = levels(root.left);
        int rightLevel = levels(root.right);

        max = Math.max(max , leftLevel + rightLevel);

        return 1 + Math.max(leftLevel , rightLevel);
    }
}
