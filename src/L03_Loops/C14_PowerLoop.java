package L03_Loops;

import java.util.Scanner;

public class C14_PowerLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        int pow = 1;
        for (int i = 1; i <= b ; i++) {
            pow *= a;
        }
        System.out.println(a+" raised to power "+b+" = "+pow);
        sc.close();
    }
}

