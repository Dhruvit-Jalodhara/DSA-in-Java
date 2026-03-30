package L20_BinarySearchTree;

public class C1_MaxMinElement {
    public int max(Node root){
        Node temp = root;
        while(temp.right != null)
            temp = temp.right;
        return temp.value;
    }

    public int min(Node root){
        Node temp = root;
        while(temp.left != null)
            temp = temp.left;
        return temp.value;
    }
}
