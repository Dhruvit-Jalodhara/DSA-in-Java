package L20_BinarySearchTree;

public class C8_LowestCommonAncestor {
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null)
            return null;

        if(p.value < root.value && q.value < root.value)
            return lowestCommonAncestor(root.left , p , q);

        if(p.value > root.value && q.value > root.value)
            return lowestCommonAncestor(root.right , p , q);

        return root;
    }
}
