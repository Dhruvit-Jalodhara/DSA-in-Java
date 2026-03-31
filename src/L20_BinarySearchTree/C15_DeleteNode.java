package L20_BinarySearchTree;

public class C15_DeleteNode {

    public Node deleteNode(Node root, int target){
        if(root == null) return null;

        if(root.value > target){
            root.left = deleteNode(root.left, target);
        }
        else if(root.value < target){
            root.right = deleteNode(root.right, target);
        }
        else{
            // Case 1: No child (leaf)
            if(root.left == null && root.right == null)
                return null;

            // Case 2: One child
            if(root.left == null)
                return root.right;

            if(root.right == null)
                return root.left;

            // Case 3: Two children
            Node pred = root.left;                  // Find inorder predecessor (max in left subtree)
            while(pred.right != null){
                pred = pred.right;
            }
            root.value = pred.value;                // Replace value
            root.left = deleteNode(root.left, pred.value);      // Delete predecessor node
        }

        return root;
    }

}
