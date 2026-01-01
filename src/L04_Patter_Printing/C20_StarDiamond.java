package L04_Patter_Printing;

import java.util.Scanner;

public class C20_StarDiamond {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2*n-1; i++) { // lines
            int k = i <= n ? i : 2*n-i ;

            for (int j = 1; j <= n-k; j++) { // spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*k-1; j++) { // stars
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}

