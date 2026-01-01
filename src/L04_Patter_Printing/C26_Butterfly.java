package L04_Patter_Printing;

import java.util.Scanner;

public class C26_Butterfly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2*n-1; i++) {
            int x = i>n ? 2*n-i : i ;
            for (int j = 1; j <= 2*n-1; j++) {
                int y = j>n ? 2*n-j : j ;
                if(y <= x) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}

