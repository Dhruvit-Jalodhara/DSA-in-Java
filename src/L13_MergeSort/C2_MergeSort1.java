package L13_MergeSort;

import java.util.*;

// merge sort is perform by divide and conquer
public class C2_MergeSort1 {

    // TC = O(n*log(n))  ,  SC = O(n*log(n))
    public static void mergeSort(int[] arr){
        int n = arr.length;

        if(n == 1) return;

        // step 1 : Create 2 new arrays of size n/2 each and copy arr into a and b
        int[] left = Arrays.copyOfRange(arr,0 , n/2);
        int[] right = Arrays.copyOfRange(arr,n/2, n);

        // step 2 : recursive call
        mergeSort(left);
        mergeSort(right);

        // step 3 : merge a and b into arr
        merge(left, right,arr);
    }

    public static int[] merge(int[] a , int[] b , int[] ans){
        int l1 = a.length , l2 = b.length;

        int i = 0 , j = 0 , k = 0 ;
        while(i < l1 && j < l2){
            if(a[i] <= b[j]) ans[k++] = a[i++];
            else ans[k++] = b[j++];
        }
        while(i < l1) ans[k++] = a[i++];
        while(j < l2) ans[k++] = b[j++];

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,6,7,2,9,3,8,0,5};
        mergeSort(arr);
        for(int x : arr) System.out.print(x + " ");
    }
}
