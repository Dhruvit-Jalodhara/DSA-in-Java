package Questions;

public class Q07_GCD {
    public static int gcd(int a, int b) {
        // method 1
//        int ans = 1;
//        for (int i = 1; i < Math.min(a,b); i++) {
//            if(a % i == 0 && b % i == 0){
//                ans = i;
//            }
//        }
//        return ans;

        //method 2
//        int ans = 1;
//        for (int i = Math.min(a,b); i >= 1; i--) {
//            if(a % i == 0 && b % i == 0){
//                ans = i;
//                break;
//            }
//        }
//        return ans;

        //method 3 : euclidean  algorithm
        // gcd(a,b) = gcd(a-b,b)  , a > b instead of this
        // we can also do gcd(a,b) = gcd(a%b,b)

        while (a > 0 && b >0){
            if(a > b) a = a % b;
            else b = b % a;
        }
        if(a == 0)
            return b;
    return a;
    }
    public static void main(String[] args) {
        System.out.println(gcd(3,6));
        System.out.println(gcd(20,28));
        System.out.println(gcd(120,128));
    }
}

