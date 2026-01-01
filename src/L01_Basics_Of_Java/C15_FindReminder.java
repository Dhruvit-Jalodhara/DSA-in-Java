package L01_Basics_Of_Java;

import java.util.Scanner;

public class C15_FindReminder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the dividend (a) : ");
        int a = sc.nextInt();

        System.out.print("enter the divisor (b) : ");
        int b = sc.nextInt();

        // dividend = divisor*quotient + remainder
        int r = a - b*(a/b);

        System.out.println("the remainder when "+a+" is divided by "+b+" is "+r);

        sc.close();
    }
}

