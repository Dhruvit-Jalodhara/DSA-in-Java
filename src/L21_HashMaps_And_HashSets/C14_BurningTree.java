package L21_HashMaps_And_HashSets;

import L19_BinaryTrees.Node;
import java.util.*;

public class C14_BurningTree {

    // Helper class to store node along with time taken to burn
    static class Pair {
        Node node;
        int time;

        Pair(Node node, int time) {
            this.node = node;
            this.time = time;
        }
    }

    // Starting node (target node) and parent mapping
    static Node start;
    static HashMap<Node, Node> parent;  // <child, parent>

    public int minTime(Node root, int target) {
        // Initialize start node and parent map
        start = null;
        parent = new HashMap<>();

        // DFS to find target node and fill parent map
        dfs(root, target);

        // Queue for BFS traversal (burning process)
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start, 0));

        // Set to track already burned nodes
        HashSet<Node> burned = new HashSet<>();
        burned.add(start);

        int maxTime = 0;

        while (q.size() > 0) {
            Pair p = q.poll();
            int time = p.time;
            Node node = p.node;

            // Burn left child
            if (node.left != null && !burned.contains(node.left)) {
                q.add(new Pair(node.left, time + 1));
                burned.add(node.left);
            }

            // Burn right child
            if (node.right != null && !burned.contains(node.right)) {
                q.add(new Pair(node.right, time + 1));
                burned.add(node.right);
            }

            // Burn parent node
            if (parent.containsKey(node) && !burned.contains(parent.get(node))) {
                q.add(new Pair(parent.get(node), time + 1));
                burned.add(parent.get(node));
            }

            // Update maximum time taken
            if (maxTime < time)
                maxTime = time;
        }

        return maxTime;
    }

    // DFS to map parent pointers and locate target node
    private void dfs(Node root, int target) {
        if (root == null)
            return;

        // Identify starting node (target)
        if (root.value == target)
            start = root;

        // Map children to their parent
        if (root.left != null)
            parent.put(root.left, root);
        if (root.right != null)
            parent.put(root.right, root);

        // Traverse left and right subtrees
        dfs(root.left, target);
        dfs(root.right, target);
    }
}
