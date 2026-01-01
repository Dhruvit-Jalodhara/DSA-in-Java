package L4_Patter_Printing;

import java.util.Scanner;

public class C18_NumericPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // lines
            for (int j = 1; j <= n-i; j++) { // spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) { // numbers
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

