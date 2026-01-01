package L06_Arrays;

import java.util.Scanner;

public class C02_InputOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] arr = {12,13,14,15,16,18,13,675,453,66,356,345,134,858,997,477};
//        int n = arr.length;   // to find the length of given array

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        // array initialize
        int[] arr = new int[n];

        // loop for input
        for (int i = 0; i < n; i++) {
            System.out.print("enter the "+(i+1)+"element of array : ");
            arr[i] = sc.nextInt();
        }

        // loop for output
        for (int i = 0; i < n; i++) {
            System.out.println("The "+(i+1)+" element of array : " + arr[i]);
        }

        sc.close();
    }
}

