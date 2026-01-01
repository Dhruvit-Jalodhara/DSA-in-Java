package L6_Arrays;

import java.util.Scanner;

public class C08_GreaterThanX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,14,-6,36,-74,-54,28,91,94,53,52,-36,102};

        int n = arr.length,count = 0;

        System.out.print("Enter the number x : ");
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if(arr[i]>x) count++;
        }

        System.out.println(count);

        sc.close();
    }
}

