package L17_Stacks;

import java.util.Stack;

public class C08_BalancedBrackets {
    // method 1 :
//    public boolean isValid(String s) {
//        Stack<Character> st = new Stack<>();
//        for (char ch : s.toCharArray()) {
//            if (ch == '(')
//                st.push(')');
//            else if (ch == '{')
//                st.push('}');
//            else if (ch == '[')
//                st.push(']');
//            else
//                if (st.isEmpty() || st.pop() != ch)
//                    return false;
//        }
//        return st.isEmpty();
//    }

    // methof 2:
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }else{
                if(st.isEmpty())
                    return false;

                if(ch == ')' && st.peek() == '(')
                    st.pop();
                else if(ch == '}' && st.peek() == '{')
                    st.pop();
                else if(ch == ']' && st.peek() == '[')
                    st.pop();
                else
                    return false;
            }
        }
        return st.isEmpty();
    }

//    public boolean isValid(String s) {
//        Stack<Character> st = new Stack<>();
//        for (char ch : s.toCharArray()) {
//            if(ch == '(' || ch == '{' || ch == '[') {
//                st.push(ch);
//            }else{
//                if(st.isEmpty())
//                    return false;
//
//                char top = st.pop();
//                if(ch == ')' && top != '(')
//                    return false;
//                else if(ch == '}' && top != '{')
//                    return false;
//                else if(ch == ']' && top != '[')
//                    return false;
//            }
//        }
//        return st.isEmpty();
//    }
}
