package L19_BinaryTrees;

import java.util.*;

public class C17_MinDistanceBtwTwoNodes {
    // method 1 :
//    public int findDist(Node root, int a, int b) {
//        List<Node> l1 = new ArrayList<>();
//        List<Node> l2 = new ArrayList<>();
//
//        search(root, a, new ArrayList<>(), l1);
//        search(root, b, new ArrayList<>(), l2);
//
//        int i = 0;
//
//        while (i < l1.size() && i < l2.size()) {
//            if (l1.get(i) == l2.get(i)) {
//                i++;
//            } else {
//                break;
//            }
//        }
//
//        return (l1.size() + l2.size() - 2*i);
//    }
//    private boolean search(Node root, int x, List<Node> temp, List<Node> ans) {
//        if (root == null) return false;
//
//        temp.add(root);
//
//        if (root.value == x) {
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
    public int findDist(Node root, int a, int b) {
        Node lca = lowestCommonAncestor(root, a, b);

        int d1 = findLevel(lca, a, 0);
        int d2 = findLevel(lca, b, 0);

        return d1 + d2;
    }
    private Node lowestCommonAncestor(Node root, int a, int b) {
        if (root == null || root.value == a || root.value == b)
            return root;

        Node left = lowestCommonAncestor(root.left, a, b);
        Node right = lowestCommonAncestor(root.right, a, b);

        if (left != null && right != null) return root;

        return left != null ? left : right;
    }
    private int findLevel(Node root, int x, int level) {
        if (root == null)
            return -1;

        if (root.value == x)
            return level;

        int left = findLevel(root.left, x, level + 1);
        if (left != -1)
            return left;

        return findLevel(root.right, x, level + 1);
    }
}
