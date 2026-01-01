package L04_Patter_Printing;

import java.util.Scanner;

public class C28_Arrow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2*n-1; i++) {
            int x = i > n ? 2*n-i : i ;
            for (int j = 1; j < x; j++) System.out.print("  ");
            for (int j = 1; j <= x; j++) System.out.print("* ");
            System.out.println();
        }
        sc.close();
    }
}

