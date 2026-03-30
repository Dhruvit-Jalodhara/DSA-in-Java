package L20_BinarySearchTree;

import javax.print.DocFlavor;

public class C2_SearchElement {
    public Node searchBST(Node root, int target) {
        if(root == null)
            return null;

        if(root.value > target)
            return searchBST(root.left , target);
        else if (root.value < target)
            return searchBST(root.right , target);
        else
            return root;
    }
}
