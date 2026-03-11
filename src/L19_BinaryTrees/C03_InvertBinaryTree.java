package L19_BinaryTrees;

public class C03_InvertBinaryTree {
    public Node invertTree(Node root) {
        if(root == null)
            return null;

        Node temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;

        return root;
    }
}
