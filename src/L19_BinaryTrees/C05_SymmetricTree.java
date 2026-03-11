package L19_BinaryTrees;

// LeetCode no : 101

public class C05_SymmetricTree {
    public boolean isSymmetric(Node root) {
        if(root == null)
            return null;

        root.right = invertTree(root.right);

        return isSameTree(root.left , root.right);
    }

    private Node invertTree(Node root) {
        if(root == null)
            return null;

        Node temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;

        return root;
    }

    private boolean isSameTree(Node p, Node q) {
        if (p == null && q == null)
            return true;

        if(p == null || q == null)
            return false;

        if(p.value != q.value)
            return false;

        return isSameTree(p.left , q.left) && isSameTree(p.right , q.right);
    }
}
