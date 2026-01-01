package L03_Loops;

import java.util.Scanner;

public class C12_ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number n : ");
        int n = sc.nextInt();

        int temp = n , rev = 0;
        while(temp != 0){
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        System.out.println(rev>0?rev:-rev);
        sc.close();
    }
}

