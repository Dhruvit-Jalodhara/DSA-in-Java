package L2_Conditionals;

import java.util.Scanner;

public class C11_GreatestOf3Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 3 distinct numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b){
            if(a > c)
                System.out.println(a + " is greatest");
            else
                System.out.println(c + " is greatest");
        }else{
            if(b > c)
                System.out.println(b + " is greatest");
            else
                System.out.println(c + " is greatest");
        }

        sc.close();
    }
}

