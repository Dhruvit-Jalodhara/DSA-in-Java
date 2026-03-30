package L20_BinarySearchTree;

// gfg practice

public class C11_LargestBST {
    static class Quad {
        long max;
        long min;
        boolean isBST;
        int size;

        Quad(long max , long min , boolean isBST , int size){
            this.max = max;
            this.min = min;
            this.isBST = isBST;
            this.size = size;
        }
    }
    static int maxSize;
    static int largestBst(Node root) {
        maxSize = 0;
        helper(root);
        return maxSize;
    }
    private static Quad helper(Node root){
        if(root == null)
            return new Quad(Long.MIN_VALUE , Long.MAX_VALUE , true , 0);

        Quad lst = helper(root.left);
        Quad rst = helper(root.right);
        long value = (long)root.value;
        long max = Math.max(value , Math.max(lst.max , rst.max));
        long min = Math.min(value , Math.min(lst.min , rst.min));
        boolean isBst = lst.max < value && rst.min > value && lst.isBST && rst.isBST;
        int size = 1 + lst.size + rst.size;

        if(isBst && maxSize < size)
            maxSize = size;

        return new Quad(max , min , isBst , size);
    }
}
