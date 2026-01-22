package L13_MergeSort;

public class C1_MergeTwoSortedArray {
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
        int[] a = {2,5,8,9,13,19,21,25};
        int[] b = {3,7,13,15,18,23,27,29,30,33};
        int[] ans = new int[a.length + b.length];
        merge(a,b,ans);
        for(int x : ans) System.out.print(x + " ");
    }
}
