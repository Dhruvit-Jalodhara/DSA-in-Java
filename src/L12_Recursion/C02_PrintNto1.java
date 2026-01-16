package L12_Recursion;

import java.util.Scanner;

public class C02_PrintNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        print(n);
    }
    public static void print(int n){
        if(n == 0) return;
        System.out.println(n);
        print(n - 1);
    }
}
