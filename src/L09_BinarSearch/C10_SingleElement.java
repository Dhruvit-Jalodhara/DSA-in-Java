package L09_BinarSearch;

public class C10_SingleElement {
    public static int search(int arr[]) {
        int n = arr.length;
        if(n == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];
        int start = 0 , end = n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if((arr[mid] != arr[mid+1]) && (arr[mid] != arr[mid-1]))
                return arr[mid];

            int first = mid , second = mid;
            if(arr[mid] == arr[mid + 1])
                second = mid + 1;
            else // arr[mid] == arr[mid - 1]
                first = mid - 1;

            if((first - start) % 2 == 0)
                start = second + 1;
            else
                end = first - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(search(arr));
    }
}
