package L6_Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class C21_AdddingTwoNumber {
    public static ArrayList<Integer> TwoSum(int[] arr1, int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;

        while (i >= 0 && j >= 0) {
            int sum = arr1[i] + arr2[j] + carry ;
            ans.add(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }

        while(i >= 0){
            int sum = arr1[i] + carry ;
            ans.add(sum % 10);
            carry = sum / 10;
            i--;
        }

        while(j >= 0){
            int sum = arr2[j] + carry ;
            ans.add(sum % 10);
            carry = sum / 10;
            j--;
        }

        if(carry != 0) ans.add(carry);

        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {3,5,2,0,7};
        int[] arr2 = {9,2,1};
        System.out.println(TwoSum(arr1,arr2));
    }
}

