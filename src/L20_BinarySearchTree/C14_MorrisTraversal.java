package L20_BinarySearchTree;

public class C14_MorrisTraversal {

    // morris inOrder traversal method
    public void morrisInorder(Node root){
        Node curr = root;  // Start from root

        // Traverse until all nodes are processed
        while(curr != null){

            // If left subtree exists
            if(curr.left != null){

                Node pred = curr.left;  // Go to left child

                // Find inorder predecessor (rightmost node in left subtree)
                while(pred.right != null && pred.right != curr){
                    pred = pred.right;
                }

                if(pred.right == null){  // Case 1: Thread not created yet
                    pred.right = curr;   // Create temporary link (thread) to current node
                    curr = curr.left;    // Move to left subtree
                }
                else{                    // Case 2: Thread already exists (we are coming back)
                    pred.right = null;   // Remove the temporary thread
                    System.out.println(curr.value); // Visit current node (inorder)
                    curr = curr.right;   // Move to right subtree
                }
            }
            // If no left subtree
            else{
                System.out.println(curr.value); // Visit node directly
                curr = curr.right;              // Move to right subtree
            }
        }
    }
}
