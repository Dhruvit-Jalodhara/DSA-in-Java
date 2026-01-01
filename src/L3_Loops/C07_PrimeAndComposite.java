package L3_Loops;

import java.util.Scanner;

public class C07_PrimeAndComposite {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number n : ");
        int n =sc.nextInt();

        boolean flag = false; // false means Number is prime

        // 60 : 1 2 3 4 5 6 10 12 15 20 30 60 -> multiply first and last always give number
        // if i is the factor of n then n/i is also the factor of n so we can check from
        // 2 to sqrt(n)

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true; // true means Number is composite
                break;
            }
        }

        if(n ==  1)
            System.out.println("Number is neither prime nor composite");
        else if(flag)
            System.out.println("Number is composite");
        else
            System.out.println("Number is prime");

        sc.close();
    }
}

