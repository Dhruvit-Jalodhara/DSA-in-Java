package L09_BinarSearch;

public class C02_FirstOccurrence {
    public static int FirstOccurrence(int[] arr, int k){
        int ans = -1;
        int start = 0 , end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2 ;

            if(arr[mid] < k)
                start = mid + 1;
            else if(arr[mid] > k)
                end = mid - 1;
            else{
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5,5,5,5,6,7,8,9};
        System.out.println(FirstOccurrence(arr,5));
    }
}
