package L20_BinarySearchTree;

public class C9_SortedArrayToBST {
    public Node sortedArrayToBST(int[] nums) {
        Node root = convert(nums , 0 , nums.length - 1);
        return root;
    }
    private Node convert(int[] num , int start , int end){
        if(start > end)
            return null;

        int mid = (start + end) / 2;
        Node root = new Node(num[mid]);
        root.left = convert(num , start , mid - 1);
        root.right = convert(num , mid + 1 , end);

        return root;
    }
}
