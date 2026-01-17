package L12_Recursion;

public class C11_FibonacciNumber {
    public static int nthFibonacci(int n) {
        if(n <= 1)
            return n;

        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
}
