package L09_2DArays;

import java.util.ArrayList;
import java.util.List;

public class C15_PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            int iCr = 1;
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                temp.add(iCr);
                iCr = iCr * (i - j) / (j + 1);
            }
            ans.add(temp);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
