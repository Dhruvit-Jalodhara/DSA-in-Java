package L19_BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C08_LeetCode102 {
//    class Pair{
//        Node node;
//        int level;
//        Pair(Node node , int level){
//            this.node = node;
//            this.level = level;
//        }
//    }
//
//    public List<List<Integer>> levelOrder(Node root) {
//        List<List<Integer>> ans = new ArrayList<>();
//
//        if (root == null)
//            return ans;
//
//        Queue<Pair> q = new LinkedList<>();
//        List<Integer> list = new ArrayList<>();
//
//        int currLevel = 0;
//        q.add(new Pair(root,0));
//
//        while(q.size() > 0){
//            Pair front = q.remove();
//            Node node = front.node;
//            int level = front.level;
//
//            if (level != currLevel) {
//                ans.add(list);
//                list = new ArrayList<>();
//                currLevel++;
//            }
//
//            list.add(node.value);
//
//            if (node.left != null)
//                q.add(new Pair(node.left, level + 1));
//            if (node.right != null)
//                q.add(new Pair(node.right, level + 1));
//        }
//        ans.add(list);
//
//        return ans;
//    }

    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            int size = q.size();       // nodes in current level
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                Node node = q.remove();
                level.add(node.value);

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }

            ans.add(level);
        }

        return ans;
    }
}

