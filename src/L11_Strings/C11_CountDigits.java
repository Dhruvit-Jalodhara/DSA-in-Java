package L11_Strings;

import java.util.Scanner;

public class C11_CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        String s = Integer.toString(n);
        System.out.println(s.length());
    }
}
