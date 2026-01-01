package L3_Loops;

import java.util.Scanner;

public class C05_DisplayGP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first term of GP a = ");
        int a = sc.nextInt();

        System.out.print("Enter the common ratio of GP r = ");
        int r = sc.nextInt();

        System.out.print("Enter the number of terms of AP n = ");
        int n = sc.nextInt();

        int gp = a;

        for (int i = 0; i < n; i++) {
            System.out.print(gp + " ");
            gp *= r;
        }
        sc.close();
    }
}

