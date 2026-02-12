package L17_Stacks;

// LeetCode : 901

import java.util.Stack;

public class StockSpanner {
    private Stack<int[]> stack;  // new int[]{price, span}
    public StockSpanner() {
        stack = new Stack<>();
    }

    private StockSpanner head;

    public int next(int price) {
        int span = 1;
        while(stack.size() > 0 && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        stack.push(new int[]{price, span});
        return span;
    }
}
