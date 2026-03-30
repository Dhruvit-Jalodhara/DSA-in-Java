package L20_BinarySearchTree;

// LeetCode 1373

public class C12_LargestSumBST {

    static class Quad {
        long max;
        long min;
        boolean isBST;
        int sum;

        Quad(long max , long min , boolean isBST , int sum){
            this.max = max;
            this.min = min;
            this.isBST = isBST;
            this.sum = sum;
        }
    }
    
    static int maxSum;
    public int maxSumBST(Node root) {
        maxSum = 0;
        helper(root);
        return maxSum;
    }

    private static Quad helper(Node root){
        if(root == null)
            return new Quad(Long.MIN_VALUE , Long.MAX_VALUE , true , 0);

        Quad lst = helper(root.left);
        Quad rst = helper(root.right);

        long value = root.value;
        long max = Math.max(value , rst.max);
        long min = Math.min(value , lst.min);
        boolean isBst = lst.max < value && rst.min > value && lst.isBST && rst.isBST;
        int sum = root.value + lst.sum + rst.sum;

        if(!isBst)
            return new Quad(Long.MAX_VALUE , Long.MIN_VALUE , false , 0);

        maxSum = Math.max(maxSum, sum);

        return new Quad(max , min , true , sum);
    }

}
