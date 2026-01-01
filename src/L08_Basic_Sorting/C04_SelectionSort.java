package L08_Basic_Sorting;

public class C04_SelectionSort {
    public static void print(int[] arr){
        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void selection(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {

            int minidx = i;
            for (int j = i; j < n ; j++){
                if(arr[j] < arr[minidx])
                    minidx = j;
            }

            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,-2,6,7,2,0, 7,2};

        print(arr);
        selection(arr);
        print(arr);
    }
}

