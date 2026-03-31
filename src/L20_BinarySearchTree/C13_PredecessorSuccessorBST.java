package L20_BinarySearchTree;

// The inorder predecessor is the node with the largest value smaller than the key (the previous node in sorted order)
// The inorder successor is the node with the smallest value greater than a given key (the next node in sorted order)

import java.util.*;

public class C13_PredecessorSuccessorBST {

    public ArrayList<Node> findPreSuc(Node root, int key) {
        ArrayList<Node> ans = new ArrayList<>();

        Node curr = root;

        //First: find the node with given key
        while(curr != null && curr.value != key){
            if(key < curr.value)
                curr = curr.left;
            else
                curr = curr.right;
        }

        Node pred = findPredecessor(curr);
        Node succ = findSuccessor(curr);

        ans.add(pred);
        ans.add(succ);

        return ans;
    }

    private Node findPredecessor(Node root){
        if(root == null || root.left == null)
            return null;

        Node pred = root.left;

        while(pred.right != null)
            pred = pred.right;

        return pred;
    }

    private Node findSuccessor(Node root){
        if(root == null || root.right == null)
            return null;

        Node succ = root.right;

        while(succ.left != null)
            succ = succ.left;

        return succ;
    }
}
