package L10_BinarySearch;

public class C06_LeetCode2529 {
    public static int maximumCount(int[] arr) {
        int pos = count(arr , true);  // count positive
        int neg = count(arr , false); // count negative
        return Math.max(pos, neg);
    }
    public static int count(int[] arr , boolean positive){
        int start = 0 , end = arr.length - 1;
        if(positive){
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(arr[mid] <= 0)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            return arr.length - start;
        }else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] < 0)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            return end + 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {-2,-1,-1,1,2,3};
        System.out.println(maximumCount(arr));
    }
}
