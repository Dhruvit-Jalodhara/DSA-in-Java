package L6_Arrays;

import java.util.Scanner;

//Multiply odd indexed elements by 2 and add 10 to even indexed elements
public class C15_que2 {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr);

        for (int i = 0; i < n; i++) {
            if( i % 2 == 0) arr[i] *= 10;
            else arr[i] *= 2;
        }

        print(arr);

        sc.close();
    }
}

