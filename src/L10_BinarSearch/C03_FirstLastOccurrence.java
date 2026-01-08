package L10_BinarSearch;

public class C03_FirstLastOccurrence {
    public static int[] FirstLast(int[] arr, int k){
        int[] ans = {-1,-1};

        ans[0] = search(arr,k,true);
        ans[1] = search(arr,k,false);

        return ans;
    }
    public static int search(int[] arr,int k,boolean first){
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
                if(first){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5,5,5,5,6,7,8,9};
        int[] ans = FirstLast(arr,5);
        System.out.println(ans[0] + "  " + ans[1]);
    }
}
