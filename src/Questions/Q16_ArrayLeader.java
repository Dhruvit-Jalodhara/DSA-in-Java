package Questions;

//You are given an array arr of positive integers. Your task is to find all the leaders in the array. An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Q16_ArrayLeader {

    //મmethod 1
//    public static boolean search(int[] arr, int target, int start){
//        int i = start + 1 , j = arr.length - 1;
//
//        while(i <= j){
//            if(arr[i] > target || arr[j] > target)
//                return true;
//            else{
//                i++;
//                j--;
//            }
//        }
//        return false;
//    }
//    static ArrayList<Integer> leaders(int arr[]) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            boolean flag = search(arr,arr[i],i);
//            if(!flag)
//                ans.add(arr[i]);
//        }
//        return ans;
//    }

    //method 2 :
    static ArrayList<Integer> leaders(int arr[]){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int max = arr[n-1];
        for (int i = n-1; i >= 0; i--) {
            if(arr[i] >= max){
                max = arr[i];
                ans.add(max);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};

        System.out.println(leaders(arr));
    }
}
