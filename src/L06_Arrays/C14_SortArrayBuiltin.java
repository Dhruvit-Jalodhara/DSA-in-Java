package L06_Arrays;

import java.util.Arrays;

public class C14_SortArrayBuiltin {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4,1,7,5,-3,10,12};

        print(arr);
        Arrays.sort(arr);
        print(arr);

    }
}

