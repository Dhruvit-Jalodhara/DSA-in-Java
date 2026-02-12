package L17_Stacks;

// Leetcode no : 503

import java.util.Stack;

public class C14_NextGreaterElement2 {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        // Traverse array twice (2*n) from right to left to handle circular nature
        for (int i = 2 * n - 1; i >= 0; i--) {

            int idx = i % n;  // Map index back into original array range

            // Remove all smaller or equal elements
            while ( st.size() > 0 && arr[idx] >= st.peek()) {
                st.pop();
            }

            // If stack empty → no greater element
            ans[idx] = st.size() == 0 ? -1 : st.peek();

            // Push current element
            st.push(arr[idx]);
        }

        return ans;
    }
}
