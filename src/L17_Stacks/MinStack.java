package L17_Stacks;

public class MinStack {
    class Node{
        int value;
        Node next;
        Node min;

        Node(int value){
            this.value = value;
            this.next = null;
            this.min = this;
        }
    }

    private Node head;
    public MinStack() {
        this.head = null;
    }

    public void push(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        if(newNode.min.value > head.min.value)
            newNode.min = head.min;
        head = newNode;
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public int top() {
        return head.value;
    }

    public int getMin() {
        return head.min.value;
    }
}

//import java.util.Stack;
//
//public class MinStack {
//    Stack<Integer> stack;
//    Stack<Integer> minStack;
//
//    public MinStack() {
//        stack = new Stack<>();
//        minStack = new Stack<>();
//    }
//
//    public void push(int val) {
//        stack.push(val);
//
//        if (minStack.isEmpty() || val <= minStack.peek()) {
//            minStack.push(val);
//        } else {
//            minStack.push(minStack.peek());
//        }
//    }
//
//    public void pop() {
//        if (!stack.isEmpty()) {
//            stack.pop();
//            minStack.pop();
//        }
//    }
//
//    public int top() {
//        return stack.peek();
//    }
//
//    public int getMin() {
//        return minStack.peek();
//    }
//}

//import java.util.Stack;
//
//public class MinStack {
//    Stack<Long> stack;   // stores values (some may be encoded)
//    long min;            // current minimum element
//
//    public MinStack() {
//        stack = new Stack<>();
//    }
//
//    public void push(int val) {
//        long value = val;  // use long to prevent overflow
//
//        // First element → initialize min
//        if (stack.isEmpty()) {
//            stack.push(value);
//            min = value;
//        }
//        // New value is new minimum → push encoded value
//        else if (value < min) {
//            stack.push(2 * value - min);  // encode previous min
//            min = value;                  // update min
//        }
//        // Normal push
//        else {
//            stack.push(value);
//        }
//    }
//
//    public void pop() {
//        // If top is encoded value → restore previous min
//        if (stack.peek() < min) {
//            min = 2 * min - stack.peek();
//        }
//        stack.pop();
//    }
//
//    public int top() {
//        // If top is encoded → actual value is current min
//        if (stack.peek() < min) {
//            return (int) min;
//        }
//        return stack.peek().intValue();
//    }
//
//    public int getMin() {
//        return (int) min;  // return current minimum
//    }
//}
