package Questions;

import java.util.ArrayList;
import java.util.List;

public class Q18_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans = new ArrayList<>();
        int fr = 0, lr = arr.length - 1;
        int fc = 0, lc = arr[0].length - 1;
        // fr -> first row , lr -> last row , fc -> first col , lc -> last col

        while (fr <= lr && fc <= lc) {

            // top row →
            for (int j = fc; j <= lc; j++)
                ans.add(arr[fr][j]);
            fr++;

            // right column ↓
            for (int i = fr; i <= lr; i++)
                ans.add(arr[i][lc]);
            lc--;

            // bottom row ←
            if (fr <= lr) {
                for (int j = lc; j >= fc; j--)
                    ans.add(arr[lr][j]);
                lr--;
            }

            // left column ↑
            if (fc <= lc) {
                for (int i = lr; i >= fr; i--)
                    ans.add(arr[i][fc]);
                fc++;
            }
        }
        return ans;
    }
}
