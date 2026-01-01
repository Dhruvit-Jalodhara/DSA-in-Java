package L2_Conditionals;

import java.util.Scanner;

public class C01_Even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if (n % 2 == 0){
            System.out.println("Given number is even ");
        }

    }
}

