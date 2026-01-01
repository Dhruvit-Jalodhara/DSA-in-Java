package L04_Patter_Printing;

import java.util.Scanner;

public class C03_AlphabetSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((char)(65 + j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

