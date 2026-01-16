package L12_Recursion;

import java.util.Scanner;

public class C07_aRaisedTOb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the base : ");
        int base = sc.nextInt();
        System.out.print("enter the power : ");
        int power = sc.nextInt();

        int ans = pow(base,power);
        System.out.println(ans);
    }
    // method 1 : TimeComplexity = O(n)
//    public static int pow(int base , int power){
//        if(power == 0 )
//            return 1;
//
//        return base * pow(base , power - 1);
//    }

    // method 2 : TimeComplexity = O(log(n))
    public static int pow(int base , int power){
        if(power == 0) return 1;

        int call = pow(base,power/2);
        if(power % 2 == 0) return  call * call;
        else return call * call * base;
    }
}
