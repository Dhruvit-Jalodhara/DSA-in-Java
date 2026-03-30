package L20_BinarySearchTree;

import java.util.*;

// LeetCode 230

// Note : InOrder of BST is alwar sorted
public class C5_KthSmallestELement {

    // method 1 :
//    public int kthSmallest(Node root, int k) {
//        List<Integer> list = new ArrayList<>();
//        inOrder(root,list);
//
//        return list.get(k - 1);
//    }
//    private void inOrder(Node root , List<Integer> temp){
//        if(root == null)
//            return;
//
//        inOrder(root.left,temp);
//        temp.add(root.value);
//        inOrder(root.right,temp);
//    }

    // method 2 :
    static int k2;
    static int ans;
    public int kthSmallest(Node root, int k) {
        k2 = k;
        ans = -1;
        inOrder(root);
        return ans;
    }
    private void inOrder(Node root){
        if(root == null)
            return;

        inOrder(root.left);

        k2--;
        if(k2 == 0)
            ans = root.value;

        inOrder(root.right);
    }
}
