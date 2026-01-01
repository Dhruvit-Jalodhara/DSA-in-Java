package L06_Arrays;

public class C22_MergeTwoSortedArray {
    public static int[] sort(int[] arr1 , int[] arr2){
        int[] ans = new int[arr1.length + arr2.length];

        int i = 0 , j = 0 , k = 0;

        while(i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j])
                ans[k++] = arr1[i++];
            else
                ans[k++] = arr2[j++];
        }

        while(i < arr1.length){
            ans[k++] = arr1[i++];
        }

        while(j < arr2.length){
            ans[k++] = arr2[j++];
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9,11,13,15,17};
        int[] arr2 = {2,4,6,6,10,11,12,14,16,17,18,20};
        int[] ans = sort(arr1,arr2);

        for (int x : ans)
            System.out.print(x + " ");
    }
}

