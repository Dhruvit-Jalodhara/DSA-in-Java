package L17_Stacks;

import java.util.Stack;

public class C16_LeetCode1944 {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            int count = 0;

            while (stack.size() > 0 && heights[i] > stack.peek()) {
                stack.pop();
                count++;
            }
            if (stack.size() > 0) {
                count++;
            }

            result[i] = count;
            stack.push(heights[i]);
        }

        return result;
    }
}
