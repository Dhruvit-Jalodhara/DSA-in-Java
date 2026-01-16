package L12_Recursion;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        print(n);
    }
    public static void print(int n){
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n - 1);
        System.out.println(n);
    }
}
