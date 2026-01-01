package L5_Methods_OR_Functions;

import java.util.Scanner;

public class C04_PnC {

    public static int Fact(int x){
        int fact = 1;

        for (int i = 1; i <= x; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();

        int ncr = Fact(n)/(Fact(r)*Fact(n-r));
        System.out.println("ncr = "+ncr);

        int npr = Fact(n)/Fact(n-r);
        System.out.println("npr = "+npr);

        sc.close();
    }
}









