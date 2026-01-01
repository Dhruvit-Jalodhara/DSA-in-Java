package L6_Arrays;

import java.util.Scanner;

public class C05_LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number you want to search : ");
        int x = sc.nextInt();
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            if(arr[i] == x){
                flag = true;
                break;
            }
        }

        if (flag)
            System.out.println("element exists");
        else
            System.out.println("element does not exists");

        sc.close();
    }
}

