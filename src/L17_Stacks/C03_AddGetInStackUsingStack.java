package L17_Stacks;

import java.util.Stack;

public class C03_AddGetInStackUsingStack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);

        int index = 3;
        System.out.println(get(index,st1));

        System.out.println(st1);
        add(4,60,st1);
        System.out.println(st1);
    }

    // 1-based index
    public static int get(int index , Stack<Integer> st1){
        Stack<Integer> st2 = new Stack<>();
        // get element using another stack
        while(st1.size() > index){
            st2.push(st1.pop());
        }
        int ans = st1.peek(); // top element
        while(st2.size() > 0){
            st1.push(st2.pop());
        }
        return ans;
    }

    // 1-based index
    public static void add(int index , int value , Stack<Integer> st1){
        Stack<Integer> st2 = new Stack<>();
        // get element using another stack
        while(st1.size() >= index){
            st2.push(st1.pop());
        }
        st1.push(value);
        while(st2.size() > 0){
            st1.push(st2.pop());
        }
    }
}
