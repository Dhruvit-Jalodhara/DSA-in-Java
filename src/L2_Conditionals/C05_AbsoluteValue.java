package L2_Conditionals;

import java.util.Scanner;

public class C05_AbsoluteValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc. nextInt();

        if(num < 0){
            num = -1*num;
        }

        System.out.println("Absolute value is : "+num);

        sc.close();
    }
}

