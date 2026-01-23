package L10_BinarySearch;

public class C12_SearchRotatedArray1 {
    public static int binarySearch(int[] arr , int target , int start , int end){
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

    // here pivot == largest element in array
    public static int findPivot(int[] arr){
        int start = 0, end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[end])
                start = mid + 1;
            else
                end = mid;
        }
        return start-1; // pivot index
    }
    public static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        int ans = binarySearch(arr,target,0,pivot);

        if(ans == -1){
            ans = binarySearch(arr , target,pivot +1 , arr.length - 1);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
        System.out.println(search(arr,0));
    }
}
