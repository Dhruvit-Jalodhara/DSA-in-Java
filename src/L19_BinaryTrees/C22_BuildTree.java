package L19_BinaryTrees;

public class C22_BuildTree {

//    public Node buildTree(int[] preorder, int[] inorder) {
//        int n = preorder.length;
//        return buildPre(preorder, 0, n - 1, inorder, 0, n - 1); // start recursion
//    }
//
//    public Node buildPre(int[] preorder, int preS, int preE, int[] inorder, int inS, int inE) {
//
//        // Base case: no elements
//        if (preS > preE || inS > inE)
//            return null;
//
//        int value = preorder[preS]; // root from preorder
//        Node root = new Node(value);
//
//        // Find root index in inorder
//        int r = -1;
//        for (int i = inS; i <= inE; i++) {
//            if (inorder[i] == value) {
//                r = i;
//                break;
//            }
//        }
//
//        int cnt = r - inS; // number of nodes in left subtree
//
//        // Build left subtree
//        root.left = buildPre(preorder, preS + 1, preS + cnt, inorder, inS, r - 1);
//
//        // Build right subtree
//        root.right = buildPre(preorder, preS + cnt + 1, preE, inorder, r + 1, inE);
//
//        return root; // return constructed root
//    }


    public Node buildTree(int[] inorder, int[] postorder) {
        int n = postorder.length;
        return buildPost(postorder , 0 , n - 1 , inorder , 0 , n - 1);
    }
    public Node buildPost(int[] postorder, int postS, int postE, int[] inorder, int inS, int inE) {

        // Base case: no elements
        if (postS > postE || inS > inE)
            return null;

        int value = postorder[postE]; // root from postorder
        Node root = new Node(value);

        // Find root index in inorder
        int r = -1;
        for (int i = inS; i <= inE; i++) {
            if (inorder[i] == value) {
                r = i;
                break;
            }
        }

        int cnt = r - inS; // number of nodes in left subtree

        // Build left subtree
        root.left = buildPost(postorder, postS , postS + cnt - 1, inorder, inS, r - 1);

        // Build right subtree
        root.right = buildPost(postorder, postS + cnt , postE - 1 , inorder, r + 1, inE);

        return root; // return constructed root
    }
}
