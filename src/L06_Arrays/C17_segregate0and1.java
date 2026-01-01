package L06_Arrays;

import static L06_Arrays.C15_que2.print;

public class C17_segregate0and1 {
//    void segregate0and1(int[] arr) {
//        int noZeros = 0;
//        for (int x : arr){
//            if(x == 0) noZeros++;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if(i < noZeros)
//                arr[i] = 0;
//            else
//                arr[i] = 1;
//        }
//    }
    public static void segregate0and1(int[] arr) {
        int i = 0 , j = arr.length-1;
        while(i <= j){
            if(arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            } else if (arr[i]==0) {
                i++;
            } else if (arr[j]==1) {
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1,1,1,0,1,0,0,1,1,0,0,1};
        segregate0and1(arr);
        print(arr);
    }
}

