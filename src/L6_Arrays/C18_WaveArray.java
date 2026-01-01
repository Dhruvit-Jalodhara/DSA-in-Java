package L6_Arrays;

public class C18_WaveArray {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sortInWave(int arr[]) {
        int n = arr.length;
        if(n < 2) return;

        for (int i = 0; i < n-1; i += 2) {
            swap(arr,i,i+1);
        }
    }
    public static void main(String[] args) {

    }
}

