package L3_Loops;

import java.util.Scanner;

public class C06_FactorOfN {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            if(n % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();

        // highest factor of n other than n itself


        // method 1  : here we check from first so we get smallest  factor first
        int hf1 = 1;
        for (int i = 1; i < n ; i++) {
            if(n % i == 0)
                hf1 = i;
        }
        System.out.println(hf1);

        // method 2  : we check from last so we get largest factor first
        int hf2 = 1;
        for (int i = n-1; i >= 1  ; i--) {
            if(n % i == 0 ){
                hf2 = i;
                break; // loop break kari nakhe
            }
        }
    }
}

