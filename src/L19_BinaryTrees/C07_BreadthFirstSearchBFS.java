package L19_BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C07_BreadthFirstSearchBFS {

//    public void levelOrder1(Node root){
//        if (root == null)
//            return;
//
//        Queue<Node> q = new LinkedList<>();
//
//        q.add(root);
//        while(q.size() > 0){
//            Node front = q.remove();
//            System.out.print(front.value + " ");
//
//            if(front.left != null)
//                q.add(front.left);
//            if(front.right != null)
//                q.add(front.right);
//        }
//        System.out.println();
//    }

    class Pair{
        Node node;
        int level;
        Pair(Node node , int level){
            this.node = node;
            this.level = level;
        }
    }
    public void levelOrder2(Node root){
        if (root == null)
            return;

        Queue<Pair> q = new LinkedList<>();

        int currLevel = 0;
        q.add(new Pair(root,0));

        while(q.size() > 0){
            Pair front = q.remove();

            if(front.level != currLevel){
                currLevel++;
                System.out.println();
            }

            System.out.print(front.node.value + " ");

            if(front.node.left != null)
                q.add(new Pair(front.node.left , front.level + 1));
            if(front.node.right != null)
                q.add(new Pair(front.node.right , front.level + 1));
        }
        System.out.println();
    }


}
