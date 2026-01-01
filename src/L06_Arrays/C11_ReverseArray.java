package L06_Arrays;

public class C11_ReverseArray {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void reverse(int[] arr){
        int s = 0 , e = arr.length-1;
        while(s <= e){
            swap(arr,s,e);
            s++;
            e--;
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6,7,8,9};
         print(arr);
         reverse(arr);
         print(arr);
    }
}

