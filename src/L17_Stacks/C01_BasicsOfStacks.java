package L17_Stacks;

import java.util.Stack;

public class C01_BasicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st); // A.S = O(n)
    }
}
