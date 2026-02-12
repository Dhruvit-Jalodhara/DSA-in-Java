package L17_Stacks;

import java.util.Stack;

public class C10_BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String s : operations) {
            if (s.equals("+")) {
                int a = st.pop();
                int b = st.pop();
                st.push(b);
                st.push(a);
                st.push(a + b);
            }
            else if (s.equals("C")) {
                st.pop();
            }
            else if (s.equals("D")) {
                st.push(2 * st.peek());
            }
            else {
                st.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        while(st.size() > 0)
            sum += st.pop();

        return sum;
    }
}
