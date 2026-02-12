package L17_Stacks;

import java.util.Stack;

public class C17_LargestRectangleHistogram {

    // Main function to calculate largest rectangle area
    public int largestRectangleArea(int[] heights) {

        int[] nextSmaller = nextSmallerIndex(heights);     // index of next smaller element
        int[] prevSmaller = previousSmallerIndex(heights); // index of previous smaller element

        int maxArea = 0;

        // Calculate area for each bar
        for (int i = 0; i < heights.length; i++) {

            // width = distance between next smaller and previous smaller
            int width = nextSmaller[i] - prevSmaller[i] - 1;

            int area = heights[i] * width;

            if(area > maxArea)
                maxArea = area;
        }

        return maxArea;
    }


    // Finds index of next smaller element on right
    public int[] nextSmallerIndex(int[] arr){

        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            // Maintain increasing stack
            while(!st.isEmpty() && arr[i] <= arr[st.peek()])
                st.pop();

            // If no smaller element → extend till end
            if(st.isEmpty())
                ans[i] = n;
            else
                ans[i] = st.peek();

            st.push(i);
        }
        return ans;
    }


    // Finds index of previous smaller element on left
    public int[] previousSmallerIndex(int[] arr){

        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            // Maintain increasing stack
            while(!st.isEmpty() && arr[i] <= arr[st.peek()])
                st.pop();

            // If no smaller element → extend till beginning
            if(st.isEmpty())
                ans[i] = -1;
            else
                ans[i] = st.peek();

            st.push(i);
        }
        return ans;
    }
}
