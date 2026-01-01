package L04_Patter_Printing;

import java.util.Scanner;

public class C24_Swastik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        int mid = n/2 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if((i <= mid && j ==1) || (j >= mid && i ==1) || (i == n && j <= mid) || (i >= mid && j ==n) || i==mid || j==mid)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
        sc.close();
    }
}

