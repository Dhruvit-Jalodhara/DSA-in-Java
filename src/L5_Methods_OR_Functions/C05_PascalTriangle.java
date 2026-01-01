package L5_Methods_OR_Functions;

import java.util.Scanner;

public class C05_PascalTriangle {

    public static int Fact(int x){
        int fact = 1;

        for (int i = 1; i <= x; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                int ncr = Fact(i) / (Fact(j) * Fact(i - j));
                System.out.printf(ncr + "   ");
            }
            System.out.println();
        }
        sc.close();
    }
}

