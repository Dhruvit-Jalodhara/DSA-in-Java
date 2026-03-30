package L20_BinarySearchTree;

// leetCode 538 & 1038

public class C7_BstToGst {

    int sum = 0;
    public Node convertBST(Node root) {
        reverseInorder(root);
        return root;
    }
    private void reverseInorder(Node root) {
        if (root == null) return;

        // Go to right (larger values first)
        reverseInorder(root.right);

        // Update sum
        sum += root.value;
        root.value = sum;

        // Go to left
        reverseInorder(root.left);
    }

}
