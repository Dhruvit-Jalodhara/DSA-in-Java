package L19_BinaryTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class C20_DFSIterative {

    public ArrayList<Integer> preOrderIterative(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null) return ans;

        Stack<Node> st = new Stack<>();
        st.push(root);

        while (st.size() > 0) {
            Node top = st.pop();
            ans.add(top.value);

            if (top.right != null)
                st.push(top.right);

            if (top.left != null)
                st.push(top.left);

        }
        return ans;
    }

    public ArrayList<Integer> postOrderIterative(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Stack<Node> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            Node top = st.pop();
            ans.add(top.value);

            if (top.left != null)
                st.push(top.left);

            if (top.right != null)
                st.push(top.right);
        }

        Collections.reverse(ans);

        return ans;
    }

    public ArrayList<Integer> inOrderIterative(Node root){
        ArrayList<Integer> ans = new ArrayList<>();

        if(root == null)
            return ans;

        Stack<Node> st = new Stack<>();
        Node curr = root;

        while (st.size() > 0 || curr != null){
            if(curr != null){
                if(curr.left != null){
                    st.push(curr);
                    curr = curr.left;
                }else{
                    ans.add(curr.value);
                    curr = curr.right;
                }
            }else{
                Node top = st.pop();
                ans.add(top.value);
                curr = top.right;
            }
        }

        return ans;
    }
}
