package L3_Loops;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number n : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; ++i) {
            System.out.println(i);
        }

    }
}

