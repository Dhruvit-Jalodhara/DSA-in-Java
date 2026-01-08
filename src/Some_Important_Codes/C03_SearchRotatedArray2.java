package Some_Important_Codes;

public class C03_SearchRotatedArray2 {
    public static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            // Left half is sorted
            if (arr[mid] > arr[end]) {
                if (target >= arr[start] && target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            // Right half is sorted
            else {
                if (target > arr[mid] && target <= arr[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr,0));
    }
}
