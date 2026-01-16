package L12_Recursion;

import java.util.Scanner;

public class C04_Print1toN {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        print(n);
    }
    // method 1 :
//    public static void print(int x , int n){
//        if(x > n) return;
//        System.out.println(x);
//        print(x + 1, n );
//    }

    // method 2 :
//    static int n;
//    public static void print(int x){
//        if(x > n) return;
//        System.out.println(x);
//        print(x + 1);
//    }

    // method 3 : Best Method
    public static void print(int n){
        if(n == 0) return;  // Base Case
        print(n - 1);   // Recursive call
        System.out.println(n);  // Work
    }
}
