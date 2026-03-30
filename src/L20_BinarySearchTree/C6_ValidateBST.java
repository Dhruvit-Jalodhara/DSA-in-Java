package L20_BinarySearchTree;

public class C6_ValidateBST {

    // method 1 :
    public boolean isValidBST(Node root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean validate(Node root, long min, long max){
        if(root == null)
            return true; // empty tree is valid

        // check current node within range
        if(root.value <= min || root.value >= max)
            return false;

        // left subtree: max becomes root.value
        // right subtree: min becomes root.value
        return validate(root.left, min, root.value) && validate(root.right, root.value, max);
    }

    // method 2 :
//    static class Pair {
//        long max;
//        long min;
//
//        Pair(long max, long min) {
//            this.max = max;
//            this.min = min;
//        }
//    }
//    static boolean flag;
//    public boolean isValidBST(Node root) {
//        flag = true;
//        maxMin(root);
//        return flag;
//    }
//    private Pair maxMin(Node root){
//        if(root == null)
//            return new Pair(Long.MIN_VALUE , Long.MAX_VALUE);
//
//        Pair lst = maxMin(root.left);
//        Pair rst = maxMin(root.right);
//        long value = (long) root.value;
//        long max = Math.max(value , Math.max(lst.max , rst.max));
//        long min = Math.min(value , Math.min(lst.min , rst.min));
//
//        if(lst.max >= value || rst.min <= value)
//            flag = false;
//
//        return new Pair(max , min);
//    }

    // method 3 :
//    static class Triplet {
//        long max;
//        long min;
//        boolean isBST;
//        Triplet(long max , long min , boolean isBST){
//            this.max = max;
//            this.min = min;
//            this.isBST = isBST;
//        }
//    }
//    public boolean isValidBST(Node root) {
//        return minMax(root).isBST;
//    }
//    private static Triplet minMax(Node root){
//        if(root == null)
//            return new Triplet(Long.MIN_VALUE , Long.MAX_VALUE , true);
//
//        Triplet lst = minMax(root.left);
//        Triplet rst = minMax(root.right);
//        long value = (long)root.value;
//        long max = Math.max(value , Math.max(lst.max , rst.max));
//        long min = Math.min(value , Math.min(lst.min , rst.min));
//
//        boolean isBst = lst.max < value && rst.min > value && lst.isBST && rst.isBST;
//
//        return new Triplet(max , min , isBst);
//    }
}
