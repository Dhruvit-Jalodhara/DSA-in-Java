package L17_Stacks;

import java.util.Stack;

public class C02_traverseStackUsingStack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);

        // printing in reverse
        Stack<Integer> st2 = new Stack<>();
        while(st1.size() > 0){
            int top = st1.pop();
            System.out.print(top + " ");
            st2.push(top);
        }

        System.out.println();

        // printing in order in which push
        while(st2.size() > 0){
            int top = st2.pop();
            System.out.print(top + " ");
            st1.push(top);
        }

    }
}
