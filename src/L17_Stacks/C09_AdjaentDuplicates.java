package L17_Stacks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class C09_AdjaentDuplicates {

    //method 1 : by stack
//    public String removeDuplicates(String s) {
//        Stack<Character> st = new Stack<>();
//        for(char ch : s.toCharArray()){
//            if(st.size() == 0 || st.peek() != ch){
//                st.push(ch);
//            }else{
//                st.pop();
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        // if sb.append(st.pop()) it will top -> bottom
//        for(char ch : st) // bottom -> top
//            sb.append(ch);
//
//        return sb.toString();
//    }

    // method 2 : by StringBuilder
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(sb.length() > 0 && ch == sb.charAt(sb.length()-1))
                sb.deleteCharAt(sb.length()-1);
            else
                sb.append(ch);
        }

        return sb.toString();
    }
}
