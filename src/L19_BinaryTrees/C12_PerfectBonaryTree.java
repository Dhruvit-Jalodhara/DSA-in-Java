package L19_BinaryTrees;

public class C12_PerfectBonaryTree {
    public boolean isPerfect(Node root) {
        int level = levels(root);
        int count = countNodes(root);
        if(count == Math.pow(2,level) - 1)
            return true;
        else
            return false;
    }
    private int levels(Node root){
        if(root == null)
            return 0;

        return  1 + Math.max(levels(root.left) , levels(root.right));
    }
    private int countNodes(Node root){
        if(root == null)
            return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
