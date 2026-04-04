package L22_Heaps;

public class C11_IsBinaryTreeHeap {
    static class Node {
        int value;
        Node left, right;

        Node(int d) {
            value = d;
            left = right = null;
        }
    }
    static int s;
    public boolean isHeap(Node root) {
        s = size(root);
        return isMaxHeap(root) && isCBT(root , 1);
    }

    private int size(Node root){
        if(root == null)
            return 0;

        return 1 + size(root.left) + size(root.right);
    }
    private boolean isCBT(Node root , int index) {
        if(root == null)
            return true;

        if(index > s)
            return false;

        return isCBT(root.left , 2*index) && isCBT(root.right , 2*index + 1);
    }

    private boolean isMaxHeap(Node root) {
        if(root == null)
            return true;

        int leftVal = (root.left != null) ? root.left.value : Integer.MIN_VALUE;
        int rightVal = (root.right != null) ? root.right.value : Integer.MIN_VALUE;

        if(root.value <= leftVal || root.value <= rightVal)
            return false;

        return isMaxHeap(root.left) && isMaxHeap(root.right);
    }
}
