package L11_Strings;

import java.util.Scanner;

// String is passed by value not pass by reference

public class C03_Palindrome {
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        int i = 0 , j = str.length() - 1;
        while (i <= j){
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        System.out.println(isPalindrome(str));

        sc.close();
    }
}
