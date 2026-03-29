package L19_BinaryTrees;

import java.util.*;

public class C16_LowestCommonAncestor {

    // method 1 :
//    public Node lowestCommonAncestor(Node root, Node p, Node q) {
//        List<Node> l1 = new ArrayList<>();
//        List<Node> l2 = new ArrayList<>();
//
//        search(root, p, new ArrayList<>(), l1);
//        search(root, q, new ArrayList<>(), l2);
//
//        int i = 0;
//        Node lca = null;
//
//        while (i < l1.size() && i < l2.size()) {
//            if (l1.get(i) == l2.get(i)) {
//                lca = l1.get(i);
//            } else {
//                break;
//            }
//            i++;
//        }
//
//        return lca;
//    }
//    private boolean search(Node root, Node x, List<Node> temp, List<Node> ans) {
//        if (root == null) return false;
//
//        temp.add(root);
//
//        if (root == x) {
//            ans.clear();
//            ans.addAll(temp);
//            return true;
//        }
//
//        if (search(root.left, x, temp, ans) || search(root.right, x, temp, ans)) {
//            return true;
//        }
//
//        temp.remove(temp.size() - 1);
//        return false;
//    }

    // method 2 :
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        // return if null or found p/q
        if (root == null || root == p || root == q) return root;

        // search in left and right subtree
        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);

        // if both sides return non-null → this is LCA
        if (left != null && right != null) return root;

        // otherwise return the non-null side
        return left != null ? left : right;
    }
}
