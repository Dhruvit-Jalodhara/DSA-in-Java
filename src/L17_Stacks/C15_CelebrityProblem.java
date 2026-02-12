package L17_Stacks;

import java.util.Stack;

public class C15_CelebrityProblem {
    public int celebrity(int[][] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while(st.size() > 1){
            int i = st.pop();
            int j = st.pop();
            boolean iflag = true , jflag = true;
            if(arr[i][j] == 1 || arr[j][i] == 0){
                iflag = false;
            }else if(arr[j][i] == 1 || arr[i][j] == 0){
                jflag = false;
            }

            if(iflag) st.push(i);
            if(jflag) st.push(j);
        }
        if(st.size() == 0) return -1;
        int celeb = st.pop();
        for (int j = 0; j < n; j++) {
            if(j == celeb) continue;
            if(arr[celeb][j] == 1) return -1;
        }
        for (int i = 0; i < n; i++) {
            if(i == celeb) continue;
            if(arr[i][celeb] == 0) return -1;
        }
        return celeb;
    }
}
