package L02_Conditionals;

import java.util.Scanner;

public class C16_TernaryOperator  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number n : ");
        int n = sc.nextInt();

        // ternary operator -> condition ? true : false ;
        System.out.println((n  % 2 == 0)? "Even" : "False");
    }
}

