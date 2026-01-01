package L01_Basics_Of_Java;

import java.util.Scanner;

public class C13_Input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();      // integer input
        double b = sc.nextDouble(); // decimal input
        String s = sc.next();      // single word
        String line = sc.nextLine(); // full line

        sc.close();
    }
}

