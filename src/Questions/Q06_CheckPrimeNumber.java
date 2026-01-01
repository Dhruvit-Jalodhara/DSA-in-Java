package Questions;

public class Q06_CheckPrimeNumber {
    public static boolean isPrime(int n){
        // method 1 (brute force)
//        for (int i = 2; i < n; i++) {
//            if(n % i == 0)
//                return false;
//        }
//        return true;

        // method 2 (optimize) : here we use i*i < n
        // cuz if i divides n the n/i also divides n
        for (int i = 2; i*i < n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(36));
        System.out.println(isPrime(5));
    }
}

