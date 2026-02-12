package L17_Stacks;

import java.util.Stack;

import static L06_Arrays.C15_que2.print;

public class C12_NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {5,2,3,13,8,7,9,10,7};
        int[] ans = nextGreaterElement(arr);
        print(arr);
        print(ans);
    }
    public static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            // Remove all smaller or equal elements
            while ( st.size() > 0 && arr[i] >= st.peek()) {
                st.pop();
            }

            // If stack empty → no greater element
            ans[i] = st.size() == 0 ? -1 : st.peek();

            // Push current element
            st.push(arr[i]);
        }

        return ans;
    }

}
