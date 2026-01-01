package L03_Loops;

import java.util.Scanner;

public class C03_TableOfN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n*i);
        }
        sc.close();
    }
}

