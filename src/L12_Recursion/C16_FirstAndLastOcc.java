package L12_Recursion;

public class C16_FirstAndLastOcc {
    public static int[] search(int[] arr , int target){
        int[] ans = new int[2];

        ans[0] = firstOccurrence(arr , 5 ,0, arr.length, -1);
        ans[1] = lastOccurrence(arr , 5 ,0, arr.length, -1);

        return ans;
    }
    public static int firstOccurrence(int[] arr , int target , int start , int end , int ans){
        if(start > end) return ans;
        int mid = start + (end - start) / 2;
        if(arr[mid] < target)
            return firstOccurrence(arr , target , mid + 1, end , ans);
        else if (arr[mid] > target)
            return firstOccurrence(arr , target , start, mid - 1 , ans);
        else
            return firstOccurrence(arr , target , start , mid - 1 , mid);
    }
    public static int lastOccurrence(int[] arr , int target , int start , int end , int ans){
        if(start > end) return ans;
        int mid = start + (end - start) / 2;
        if(arr[mid] < target)
            return lastOccurrence(arr , target , mid + 1, end , ans);
        else if (arr[mid] > target)
            return lastOccurrence(arr , target , start, mid - 1 , ans);
        else
            return lastOccurrence(arr , target , mid + 1 , end , mid);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5,5,5,5,6,7,8,9};
        int[] ans = search(arr,5);
        System.out.println(ans[0] + "  " + ans[1]);
    }
}
