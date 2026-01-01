package L6_Arrays;

public class C07_SecondLargest {

    public static void main(String[] args) {
        int[] arr = {12,14,-6,36,-74,-54,28,91,94,53,52,-36,102};

        int n = arr.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if(arr[i] > max1 && arr[i] > max2){
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i]>max2 && arr[i]<max1) {
                max2 = arr[i];
            }
        }

        System.out.println("first Max value : "+max1);
        System.out.println("second Max value : "+max2);
    }
}

