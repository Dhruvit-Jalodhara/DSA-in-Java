package L21_HashMaps_And_HashSets;

import java.util.*;
import L19_BinaryTrees.Node;

public class C12_TopViewBT {
    // Helper class to store a node along with its horizontal distance
    static class Pair {
        Node node;
        int dis;

        Pair(Node node, int num) {
            this.node = node;
            this.dis = num;
        }
    }

    public ArrayList<Integer> topView(Node root) {
        // If tree is empty, return empty list
        if (root == null) return new ArrayList<>();

        // Queue for BFS traversal
        Queue<Pair> q = new LinkedList<>();

        // Map to store first node at each horizontal distance
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Start with root at horizontal distance 0
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair p = q.poll();

            // Store node value if this horizontal distance is seen first time
            if (!map.containsKey(p.dis)) {
                map.put(p.dis, p.node.value);
            }

            // Add left child with horizontal distance -1
            if (p.node.left != null)
                q.add(new Pair(p.node.left, p.dis - 1));

            // Add right child with horizontal distance +1
            if (p.node.right != null)
                q.add(new Pair(p.node.right, p.dis + 1));
        }

        // Return values in sorted order of horizontal distance
        return new ArrayList<>(map.values());
    }
}
