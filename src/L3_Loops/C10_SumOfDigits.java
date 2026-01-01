package L3_Loops;

import java.util.Scanner;

public class C10_SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number n : ");
        int n = sc.nextInt();

        int sum = 0 , temp = n;
        while (temp != 0){
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }

        System.out.println("The of digits of number "+n+" is "+ ((sum>0)?sum:-sum));
        // bcz if number is negative sum will also be negative so to make it positive we used
        // ternary operator

        sc.close();
    }
}

