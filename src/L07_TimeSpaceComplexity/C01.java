package L07_TimeSpaceComplexity;

public class C01 {

    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2,4};
        int n = arr.length - 1; // given size of array = n + 1

        // method 1
        for (int i = 0; i < n+1; i++) {
            for (int j = i+1; j < n+1; j++) {
                if (arr[i] == arr[j]){
                    System.out.println("duplicate element : " + arr[i]);
                    break;
                }
            }
        }

        // method 2

        boolean[] flag = new boolean[n+1]; // as we know that there are total 5 different number so we make
        // check array to confirm that number is already present

        for (int i = 0; i < n+1; i++) {
            if(flag[arr[i]]){
                System.out.println("duplicate element : " + arr[i]);
                break;
            }else{
                flag[arr[i]] = true;
            }
        }

        // method 3
        int sum = (n*(n+1))/2;
        int arrsum = 0;
        for (int x : arr){
            arrsum += x;
        }
        System.out.println("duplicate element : " + (arrsum - sum));

    }
}

