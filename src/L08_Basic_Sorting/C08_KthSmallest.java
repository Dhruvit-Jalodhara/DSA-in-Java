package L08_Basic_Sorting;

public class C08_KthSmallest {
    public static int kthSmallest(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            int minidx = i;
            for (int j = i; j < n; j++) {
                if(arr[j] < arr[minidx])
                    minidx = j;
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }

        return arr[k-1];
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        System.out.println(kthSmallest(arr, 4));
    }
}

