package L4_Patter_Printing;

import java.util.Scanner;

public class C10_ZeroOneTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k = k==1 ? 0 : 1;

                // other method :
//                if((i+j) % 2 == 0) System.out.println(1 + " ");
//                else System.out.println(0 + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

