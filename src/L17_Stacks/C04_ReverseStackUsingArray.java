package L17_Stacks;

import java.util.Stack;

public class C04_ReverseStackUsingArray {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);

        System.out.println(st1);
        reverseStack(st1);
        System.out.println(st1);

    }

    public static void reverseStack(Stack<Integer> st){
        int[] temp = new int[st.size()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = st.pop();
        }
        for (int i = 0; i < temp.length; i++) {
            st.push(temp[i]);
        }
    }
}
