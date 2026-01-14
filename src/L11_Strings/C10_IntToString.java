package L11_Strings;

import java.util.Scanner;

public class C10_IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        String s = ""; // empty string

        s = s + n;
        System.out.println(s);

        // in built method :-> we use this most of time
        String str = Integer.toString(n);
        System.out.println(str);



    }
}
