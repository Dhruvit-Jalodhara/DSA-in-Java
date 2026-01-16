package L12_Recursion;

import java.util.Scanner;

public class C08_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the positive number : ");
        int n = sc.nextInt();

        int ans = reverse(0,n);
        System.out.println(ans);

        sc.close();
    }

    public static int reverse(int ans , int n){
        if(n == 0)
            return ans;

        ans = ans * 10 + (n % 10);
        return reverse(ans , n / 10);
    }

}
