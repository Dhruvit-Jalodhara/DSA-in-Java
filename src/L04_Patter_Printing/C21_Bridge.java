package L04_Patter_Printing;

import java.util.Scanner;

public class C21_Bridge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2*n-1; i++) System.out.print("* ");
        System.out.println();
        for (int i = 1; i <= n-1; i++) { // lines
            for (int j = 1; j <= n-i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}

