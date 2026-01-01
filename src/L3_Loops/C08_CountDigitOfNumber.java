package L3_Loops;

import java.util.Scanner;

public class C08_CountDigitOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number n : ");
        int n = sc.nextInt();

        if(n == 0) n = 1; // bcz 0 is 1 digit number
        int temp = n,count = 0;
        while(temp != 0){
            count++;
            temp /= 10;
        }
        System.out.println("Digit in number " + n + " is "+count);
        sc.close();
    }
}

