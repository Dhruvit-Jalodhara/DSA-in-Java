package L09_BinarSearch;

public class C01_BasicBS {
    public static int search(int[] arr, int target) {
        int n = arr.length;
        int start = 0 , end = n -1;
        while(start <= end){
            int mid = start + (end - start)/2 ;

            if(arr[mid] < target)
                start = mid + 1;
            else if(arr[mid] > target)
                end = mid - 1;
            else
                return mid;
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
