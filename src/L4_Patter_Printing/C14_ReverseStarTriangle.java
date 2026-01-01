package L4_Patter_Printing;

import java.util.Scanner;

public class C14_ReverseStarTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        // method 1
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if(j <= n - i)
//                    System.out.print("  ");
//                else
//                    System.out.print(" *");
//            }
//            System.out.println();
//        }

        // method 2
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) { // spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) { // stars
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}

