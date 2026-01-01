package L03_Loops;

import java.util.Scanner;

public class C13_Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number n : ");
        int n  = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact *= i;
        }
        if(n < 0){
            System.out.println("Enter valid number n");
            return;
        }
        System.out.println("Factorial of number n is : "+fact);
        sc.close();
    }
}

