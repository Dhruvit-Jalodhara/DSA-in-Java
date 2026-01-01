package L6_Arrays;

//LeetCode no : 189

public class C12_RotateArray {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[] arr , int s , int e){
        while(s <= e){
            swap(arr,s,e);
            s++;
            e--;
        }
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums , 0 , n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        print(arr);

        rotate(arr,3);

        print(arr);
    }
}

