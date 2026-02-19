package L18_Queues;

import java.util.Stack;

public class C9_CustomQueueViaStacks {
    Stack<Integer> st1;
    Stack<Integer> st2;
    int size;

    public C9_CustomQueueViaStacks() {
        this.st1 = new Stack<>();
        this.st2 = new Stack<>();
        this.size = 0;
    }

    public void push(int x) {
        st1.push(x);
        size++;
    }

    public int pop() {
        while(st1.size() != 1){
            st2.push(st1.pop());
        }
        int val = st1.pop();
        while(st2.size() > 0){
            st1.push(st2.pop());
        }
        size--;
        return val;
    }

    public int peek() {
        while(st1.size() != 1){
            st2.push(st1.pop());
        }
        int val = st1.peek();
        while(st2.size() > 0){
            st1.push(st2.pop());
        }
        return val;
    }

    public boolean empty() {
        return (st1.size() == 0);
    }
}
