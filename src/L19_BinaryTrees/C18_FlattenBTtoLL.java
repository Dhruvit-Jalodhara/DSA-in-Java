package L19_BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class C18_FlattenBTtoLL {
    // method 1 :
//    public void flatten(Node root) {
//        List<Node> temp = new ArrayList<>();
//        preOrder(root , temp);
//
//        for (int i = 0; i < temp.size() - 1; i++) {
//            temp.get(i).right = temp.get(i + 1);
//            temp.get(i).left = null;
//        }
//    }
//    private void preOrder(Node root , List<Node> temp){
//        if(root == null)
//            return;
//
//        temp.add(root);
//        preOrder(root.left , temp);
//        preOrder(root.right , temp);
//    }

    // method 2 :
//    public void flatten(Node root) {
//        if(root == null)
//            return;
//
//        Node lst = root.left;
//        Node rst = root.right;
//        root.left = null;
//        root.right = null;
//
//        flatten(lst);
//        flatten(rst);
//
//        root.right = lst;
//
//        Node temp = root;
//        while(temp.right != null){
//            temp = temp.right;
//        }
//
//        temp.right = rst;
//    }

    // method 3 : By Modified morris
    public void flatten(Node root) {

        Node curr = root;  // Start from root

        while(curr != null){                // Traverse the tree
            if(curr.left != null){          // If left subtree exists

                Node pred = curr.left;      // Start from left child
                while(pred.right != null){  // Find the rightmost node of left subtree (predecessor)
                    pred = pred.right;
                }
                pred.right = curr.right;    // Attach original right subtree to the rightmost node
                curr.right = curr.left;     // Move left subtree to the right

                curr.left = null;           // Set left to null (as per linked list structure)
            }

            curr = curr.right;              // Move to next node (right side)
        }
    }

}
