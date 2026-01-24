package L14_CyclicSort;

public class C2_CycleSort2 {
    public static void print(int[] arr){
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

    // for array contains elements from 1 to n
    public static void cycleSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIdx = arr[i]-1;
            if(arr[i] == i + 1){
                i++;
            }
            else{
                int temp = arr[correctIdx];
                arr[correctIdx] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,2,7,6,9,8,1,3,5};
        print(arr);
        cycleSort(arr);
        print(arr);
    }
}
