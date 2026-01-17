package L12_Recursion;

public class C14_RecursionOnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        print(arr,0);
        System.out.println();

        revprint(arr,0);
        System.out.println();

        int x = 3;
        System.out.println(exists(arr,x , 0));
    }
    public static void print(int[] arr , int idx){
        if(idx == arr.length) return;
        System.out.print(arr[idx] + " ");
        print(arr, idx + 1);
    }
    public static void revprint(int[] arr , int idx){
        if(idx == arr.length) return;
        revprint(arr, idx + 1);
        System.out.print(arr[idx] + " ");
    }
    public static boolean exists(int[] arr , int x , int idx){
        if(idx == arr.length) return false;
        if(arr[idx] == x) return true;

        return exists(arr,x,idx+1);
    }
}
