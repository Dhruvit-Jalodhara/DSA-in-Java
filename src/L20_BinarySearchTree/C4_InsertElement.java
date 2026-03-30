package L20_BinarySearchTree;

//  LeetCode 701

public class C4_InsertElement {

    // method 1 :
//    public Node insertIntoBST(Node root, int val) {
//        if(root == null)
//            return new Node(val); // create root if tree empty
//
//        insert(root , val); // insert recursively
//        return root; // return original root
//    }
//
//    private void insert(Node root , int value){
//        if(root == null)
//            return; // safety check
//
//        if(root.value > value){ // go left
//            if(root.left == null)
//                root.left = new Node(value); // insert here
//            else
//                insert(root.left , value); // recurse left
//        } else { // go right
//            if(root.right == null)
//                root.right = new Node(value); // insert here
//            else
//                insert(root.right , value); // recurse right
//        }
//    }

    // method 2 :
    public Node insertIntoBST(Node root, int val) {
        if(root == null)
            return new Node(val);

        if(val < root.value)
            root.left = insertIntoBST(root.left, val); // attach left
        else
            root.right = insertIntoBST(root.right, val); // attach right

        return root;
    }
}
