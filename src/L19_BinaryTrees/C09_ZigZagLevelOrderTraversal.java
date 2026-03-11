package L19_BinaryTrees;

import java.util.*;

public class C09_ZigZagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) {

            int size = q.size();       // nodes in current level
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                Node node = q.remove();
                level.add(node.value);

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            if (!leftToRight)
                Collections.reverse(level);

            ans.add(level);
            leftToRight = !leftToRight;
        }
        return ans;
    }
}
