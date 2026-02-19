package L17_Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class C18_CustomStackViaQueue {
    Queue<Integer> q;

    C18_CustomStackViaQueue(){
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        int n = q.size();

        for (int i = 0; i < n - 1; i++) {
            q.add(q.remove());
        }
        int x = q.remove();

        return x;
    }

    public int top() {
        int n = q.size();

        for (int i = 0; i < n - 1; i++) {
            q.add(q.remove());
        }
        int x = q.peek();

        q.add(q.remove());

        return x;
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
