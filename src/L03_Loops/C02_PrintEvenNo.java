package L03_Loops;

import java.util.Scanner;

public class C02_PrintEvenNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number n : ");
        int n = sc.nextInt();

        // loop n times chalse : good
        for (int i = 0; i <= n; i++) {
            if(i % 2 == 0)
                System.out.print(i + " ");
        }

        System.out.println();

        // loop n/2 times chalse : best
        for (int i = 0; i <= n; i+=2) {
            System.out.print(i + " ");
        }
    }
}

