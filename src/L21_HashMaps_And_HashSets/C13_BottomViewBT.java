package L21_HashMaps_And_HashSets;

import L19_BinaryTrees.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class C13_BottomViewBT {
    // Helper class to store a node with its horizontal distance
    static class Pair {
        Node node;
        int dis;

        Pair(Node node, int num) {
            this.node = node;
            this.dis = num;
        }
    }

    public ArrayList<Integer> bottomView(Node root) {
        // Return empty list if tree is null
        if (root == null) return new ArrayList<>();

        // Queue for BFS traversal
        Queue<Pair> q = new LinkedList<>();

        // Map to store the latest node at each horizontal distance
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Start with root at horizontal distance 0
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair p = q.poll();

            // Always update the value for the horizontal distance
            // This ensures the bottom-most node is stored
            map.put(p.dis, p.node.value);

            // Add left child with horizontal distance -1
            if (p.node.left != null)
                q.add(new Pair(p.node.left, p.dis - 1));

            // Add right child with horizontal distance +1
            if (p.node.right != null)
                q.add(new Pair(p.node.right, p.dis + 1));
        }

        // Return values sorted by horizontal distance
        return new ArrayList<>(map.values());
    }
}
