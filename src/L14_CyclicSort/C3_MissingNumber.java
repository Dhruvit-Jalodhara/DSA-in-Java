package L14_CyclicSort;

public class C3_MissingNumber {

    // given n - 1 == length of array
    public static int missingNum(int arr[]) {
        int n = arr.length + 1;
        int i = 0;

        while(i < arr.length){
            int correctIdx = arr[i] - 1;

            if(arr[i] == i + 1 || arr[i] == n){
                i++;
            }else{
                int temp = arr[correctIdx];
                arr[correctIdx] = arr[i];
                arr[i] = temp;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if(arr[i] !=  i+1)
                return i+1;
        }
        return n;
    }
}
