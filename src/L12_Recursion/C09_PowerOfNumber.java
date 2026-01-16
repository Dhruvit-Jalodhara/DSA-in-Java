package L12_Recursion;

// Given a number n, find the value of n raised to the power of its own reverse.
public class C09_PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(reverseExponentiation(10));
    }
    public static int reverseExponentiation(int n) {
        int base = n;
        int power = reverse(n);
        return pow(base,power);
    }
    public static int reverse(int n){
        int temp = n;
        int ans = 0;
        while (temp > 0){
            int rem = temp % 10;
            ans = ans*10 + rem;
            temp /= 10;
        }
        return ans;
    }
    public static int pow(int base , int power){
        if(power == 0) return 1;

        int call = pow(base,power/2);
        if(power % 2 == 0) return  call * call;
        else return call * call * base;
    }
}
