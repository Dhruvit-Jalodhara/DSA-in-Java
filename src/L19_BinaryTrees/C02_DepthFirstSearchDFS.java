package L19_BinaryTrees;

public class C02_DepthFirstSearchDFS {
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

        preOrder(a);
        System.out.println();

        inOrder(a);
        System.out.println();

        postOrder(a);
        System.out.println();
    }

    // PreOrder : Node -> Left -> Right
    private static void preOrder(Node root){
        if(root == null)
            return;

        System.out.print(root.value + " ");     // Node
        preOrder(root.left);                    // Left
        preOrder(root.right);                   // Right

    }

    // InOrder :  Left -> Node -> Right
    private static void inOrder(Node root){
        if(root == null)
            return;

        inOrder(root.left);                    // Left
        System.out.print(root.value + " ");     // Node
        inOrder(root.right);                   // Right
    }

    // PostOrder : Left -> Right -> Node
    private static void postOrder(Node root){
        if(root == null)
            return;

        postOrder(root.left);                    // Left
        postOrder(root.right);                   // Right
        System.out.print(root.value + " ");     // Node

    }
}
