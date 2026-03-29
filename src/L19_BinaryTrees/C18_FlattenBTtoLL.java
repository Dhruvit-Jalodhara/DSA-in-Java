package L19_BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class C18_FlattenBTtoLL {
    // method 1 :
//    public void flatten(Node root) {
//        List<Node> temp = new ArrayList<>();
//        preOrder(root , temp);
//
//        for (int i = 0; i < temp.size() - 1; i++) {
//            temp.get(i).right = temp.get(i + 1);
//            temp.get(i).left = null;
//        }
//    }
//    private void preOrder(Node root , List<Node> temp){
//        if(root == null)
//            return;
//
//        temp.add(root);
//        preOrder(root.left , temp);
//        preOrder(root.right , temp);
//    }

    public void flatten(Node root) {
        if(root == null)
            return;

        Node lst = root.left;
        Node rst = root.right;
        root.left = null;
        root.right = null;

        flatten(lst);
        flatten(rst);

        root.right = lst;

        Node temp = root;
        while(temp.right != null){
            temp = temp.right;
        }

        temp.right = rst;
    }



}
