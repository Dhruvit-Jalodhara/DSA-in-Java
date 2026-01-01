package L8_Basic_Sorting;

public class C02_BubbleSort {
    public static void print(int[] arr){
        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void bubbleAsc(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int swap = 0; // instead of swap we can also use boolean swapped true or false if swapped ==
            // false then break the outside loop

            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0) break;
        }
    }
    public static void bubbleDes(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int swap = 0; // instead of swap we can also use boolean swapped true or false if swapped ==
            // false then break the outside loop

            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0) break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,-2,6,7,2,0, 7,2};

        print(arr);
        bubbleAsc(arr);
        print(arr);
        bubbleDes(arr);
        print(arr);

    }
}

