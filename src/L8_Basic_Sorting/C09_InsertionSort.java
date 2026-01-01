package L8_Basic_Sorting;

public class C09_InsertionSort {
    public static void insertion(int[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int j = i;
            while(j >= 1 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,1,7,3,9,2,0,8};

        for(int x : arr)
            System.out.print(x + " ");

        System.out.println();

        insertion(arr);

        for(int x : arr)
            System.out.print(x + " ");
    }
}

