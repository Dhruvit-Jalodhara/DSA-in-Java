package L14_CyclicSort;

public class C1_CycleSort1 {

    // for array contains elements 0 to n-1
    public static void cycleSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIdx = arr[i];

            if(arr[i] != arr[correctIdx]) {
                int temp = arr[correctIdx];
                arr[correctIdx] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,0};

        print(arr);
        cycleSort(arr);
        print(arr);
    }

    public static void print(int[] arr){
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}
