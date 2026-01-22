package L13_MergeSort;

// Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].

import java.util.Arrays;

public class C3_CountInversions {
    static int count;
    public static int inversionCount(int arr[]) {
        count = 0;
        mergeSort(arr);
        return count;
    }
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

    public static void merge(int[] a , int[] b , int[] ans){
        int l1 = a.length , l2 = b.length;

        int i = 0 , j = 0 , k = 0 ;
        while(i < l1 && j < l2){
            if(a[i] <= b[j]) ans[k++] = a[i++];
            else {
                // just 1 line logic change in code of merge sort
                count += a.length - i;  // since a[i] > b[j], all elements a[i...end] will also be > b[j]
                ans[k++] = b[j++];
            }
        }
        while(i < l1) ans[k++] = a[i++];
        while(j < l2) ans[k++] = b[j++];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(inversionCount(arr));
    }
}
