package L04_Patter_Printing;

import java.util.Scanner;

public class C22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // lines
            for (int j = 1; j <= n; j++) {

                System.out.print(Math.min(i,j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

