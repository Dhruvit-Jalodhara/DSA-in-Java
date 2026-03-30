package L20_BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class C3_RangeSum {

    // method 1 :
//    public int rangeSumBST(Node root, int low, int high) {
//        List<Integer> temp = new ArrayList<>();
//
//        sum(root , low , high , temp);
//
//        int sum = 0;
//        for (int i = 0; i < temp.size(); i++) {
//            sum += temp.get(i);
//        }
//        return sum;
//    }
//    private List<Integer> sum(Node root , int low , int high , List<Integer> temp){
//        if(root == null)
//            return temp;
//
//        if(root.value <= high && root.value >= low)
//            temp.add(root.value);
//
//        sum(root.left,low,high,temp);
//        sum(root.right,low,high,temp);
//
//        return temp;
//    }

    // method 2 :
//    public int rangeSumBST(Node root, int low, int high) {
//        if (root == null)
//            return 0; // base case
//
//        int sum = 0;
//
//        // if value in range → include it
//        if (root.value >= low && root.value <= high)
//            sum += root.value;
//
//        // go left
//        sum += rangeSumBST(root.left, low, high);
//
//        // go right
//        sum += rangeSumBST(root.right, low, high);
//
//        return sum;
//    }

    // method 3 :
    public int rangeSumBST(Node root, int low, int high) {
        if(root == null)
            return 0;

        if(root.value < low)
            return rangeSumBST(root.right , low , high);
        else if (root.value > high)
            return rangeSumBST(root.left , low , high);
        else
            return root.value + rangeSumBST(root.right , low , high) + rangeSumBST(root.left , low , high);
    }
}
