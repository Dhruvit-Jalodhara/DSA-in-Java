package Questions;

import java.util.ArrayList;

public class Q13_unionOfTwoSortedArray {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0 , j = 0;
        while(i < a.length && j < b.length){
            if(i > 0 && a[i] == a[i-1]){
                i++;
                continue;
            }
            if(j > 0 && b[j] == b[j-1]){
                j++;
                continue;
            }

            if(a[i] < b[j]){
                ans.add(a[i]);
                i++;
            }else if(a[i] > b[j]){
                ans.add(b[j]);
                j++;
            }else{
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        while(i < a.length){
            if(i == 0 || a[i] != a[i-1])
                ans.add(a[i]);
            i++;
        }
        while(j < b.length){
            if(j == 0 || b[j] != b[j-1])
                ans.add(b[j]);
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}

