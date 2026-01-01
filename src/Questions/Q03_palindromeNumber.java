package Questions;

public class Q03_palindromeNumber {
    public static boolean ispalindrome(int n){
        int rev = 0;
        int temp = n;
        while(n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        if(rev == temp) return true;
        return false;
    }
    public static void main(String[] args) {

    }
}

