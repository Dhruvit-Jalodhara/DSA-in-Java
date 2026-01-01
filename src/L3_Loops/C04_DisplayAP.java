package L3_Loops;

import java.util.Scanner;

public class C04_DisplayAP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first term of AP a = ");
        int a = sc.nextInt();

        System.out.print("Enter the common difference of AP d = ");
        int d = sc.nextInt();

        System.out.print("Enter the number of terms of AP n = ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print((a + i*d) + " ");
        }
        sc.close();
    }
}

