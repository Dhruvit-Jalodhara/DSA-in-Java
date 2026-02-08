package L17_Stacks;

import java.util.Stack;

public class C05_PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);

        System.out.println(st1);
        pushAtBottom(100,st1);
        System.out.println(st1);
    }
    public static void pushAtBottom(int element , Stack<Integer> st){
        if(st.size() == 0){
            st.push(element);
            return;
        }

        int top = st.pop();
        pushAtBottom(element, st);
        st.push(top);
    }
}
