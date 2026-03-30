package L20_BinarySearchTree;

// LeetCode 116

import java.util.*;

public class C10_PopulatingNextRightPointer {
    static class Node {
        int value;
        Node left;
        Node right;
        Node next;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
            this.next = null;
        }
    }
    public Node connect(Node root) {
        if(root == null)
            return null;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(q.size() > 0){
            int size = q.size();
            Node prev = null;

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();

                if (curr != null) {
                    curr.next = prev;
                }
                prev = curr;

                if(curr.right != null)
                    q.add(curr.right);
                if(curr.left != null)
                    q.add(curr.left);
            }
        }
        return root;
    }
}


