package L6_Arrays;

import java.util.Arrays;

public class C13_ShallowCopyDeepCopy {

    public static void main(String[] args) {
        int[] x = {10,20,30,40};
        int[] arr = x; // shallow copy of x : means both arr and x pointing at same array
        x[0] = 100;
        System.out.println(arr[0]);

        int[] y = Arrays.copyOf(x, x.length); // deep copy of x : both pointing to different array
        y[1] = 200;
        System.out.println(y[1]);
        System.out.println(x[1]);
    }
}

