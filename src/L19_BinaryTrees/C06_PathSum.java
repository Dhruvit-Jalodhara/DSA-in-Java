package L19_BinaryTrees;

// LeetCode no : 112

public class C06_PathSum {
    // Method 1 :
//    public boolean hasPathSum(Node root, int targetSum){
//        if(root == null)
//            return false;
//        return helper(root,targetSum,0);
//    }
//    private boolean helper(Node root , int targetSum , int sum) {
//        if(root == null)
//            return false;
//
//        sum += root.value;
//
//        if(root.left == null && root.right == null)
//            return (sum == targetSum);
//
//        return helper(root.right, targetSum, sum) || helper(root.left, targetSum, sum);
//    }

    // method 2 :
    private boolean hasPathSum(Node root, int targetSum) {
        if (root == null)
            return false;

        if (root.left == null && root.right == null)
            return targetSum == root.value;

        targetSum -= root.value;
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}

