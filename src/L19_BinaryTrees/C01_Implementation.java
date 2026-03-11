package L19_BinaryTrees;

public class C01_Implementation {
    public static void main(String[] args) {
        Node a = new Node (3);
        Node b = new Node (4);
        Node c = new Node (2);
        Node d = new Node(-1);
        Node e = new Node (1);
        Node f = new Node (6);
        Node g = new Node (9);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        display(a);
        System.out.println(getSize(a));
        System.out.println(sumBT(a));
        System.out.println(findMax(a));
        System.out.println(findMin(a));
        System.out.println(levels(a));
    }

    private static void display(Node root){
        if(root == null)
            return;

        System.out.print(root.value + " ");
        display(root.left);
        display(root.right);
    }

    private static int getSize(Node root) {
        if(root == null)
            return 0;

        return getSize(root.left) + 1 + getSize(root.right);
    }

    private static int sumBT(Node root) {
        if(root == null)
            return 0;

        return sumBT(root.left) + root.value + sumBT(root.right);
    }

    private static int findMax(Node root) {
        if(root == null)
            return Integer.MIN_VALUE;

        return Math.max( root.value , Math.max( findMax(root.left) , findMax(root.right) ) );
    }

    private static int findMin(Node root) {
        if(root == null)
            return Integer.MAX_VALUE;

        return Math.min( root.value , Math.min( findMin(root.left) , findMin(root.right) ) );
    }

    private static int levels(Node root) {
        if(root == null)
            return 0;

        return 1 + Math.max( levels(root.right) , levels(root.left) );
    }
}
