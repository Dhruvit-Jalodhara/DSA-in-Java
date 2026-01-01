package L08_Basic_Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class C06_CommonElements {
    public static ArrayList<Integer> commonElements(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;
        while(i < a.length && j < b.length){
            if(a[i] == b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }else if(a[i] < b[j]) i++;
            else j++;
        }
        return ans;
    }
    public static void main(String[] args) {
    }
}

