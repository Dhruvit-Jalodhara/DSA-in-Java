package L12_Recursion;

public class C15_BinarySearchOnArray {
    public static int search(int[] arr , int target){
        return binarySearch(arr , target , 0 , arr.length - 1);
    }
    public static int binarySearch(int[] arr , int target , int start , int end){
        if(start > end) return -1;
        int mid = start + (end - start) / 2;
        if(arr[mid] > target)
            return binarySearch(arr , target , start ,mid - 1);
        else if (arr[mid] < target)
            return binarySearch(arr , target , mid + 1 ,end);
        else
            return mid;
    }
}
