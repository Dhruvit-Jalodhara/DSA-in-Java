package L8_Basic_Sorting;

public class C03_MovesZerosToEnd {
    public static void print(int[] arr){
        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void moveZeros(int[] arr){
        // method 1 : TC = O((n-1)^2)
        int n = arr.length;
//        for (int i = 0; i < n-1; i++) {
//
//            for (int j = 0; j < n-1; j++) {
//                if(arr[j] == 0){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }

        // method 2 : TC = O(n)

        int j = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        // method 3

        int index = 0; // position for next non-zero element
        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        // Fill remaining positions with zeros
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,-2,3,0,4,8,1,0,12,0,11};
        print(arr);
        moveZeros(arr);
        print(arr);
    }
}

