package L18_Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class C4_ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); // front
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60); // rear
        System.out.println(q);
        reverseByStack(q);
        System.out.println(q);
        reverseByRecursion(q);
        System.out.println(q);
    }
    private static void reverseByStack(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while(q.size() > 0)
            st.push(q.remove());

        while(st.size() > 0)
            q.add(st.pop());
    }
    private static void reverseByRecursion(Queue<Integer> q){
        if(q.size() == 0)
            return;

        int front = q.remove();
        reverseByRecursion(q);
        q.add(front);
    }
}
