package L6_Arrays;

public class C06_Max {

    public static void main(String[] args) {
        int[] arr = {12,14,-6,36,-74,-54,28,91,94,53,52,-36};

        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if(arr[i] > max)
                max = arr[i];
        }

        System.out.println("Max value : "+max);
    }
}

