package L12_Recursion;

public class C10_HcfOrGcd {
    // method 1 :
//    public static int gcd(int a , int b){
//        for (int i = Math.min(a,b); i >= 1; i--) {
//            if(a % i == 0 && b % i == 0){
//                return i;
//            }
//        }
//        return 1;
//    }

    // method 2 :
//    public static int gcd(int a, int b) {
//        while(b != 0) {
//            int temp = a % b;
//            a = b;
//            b = temp;
//        }
//        return a;
//    }


    //method 3 : euclidean  algorithm
    // gcd(a,b) = gcd(b-a,a)  , b > a instead of this
    // we can also do gcd(a,b) = gcd(b%a,a) , b > a
    public static int gcd(int a , int b){
        if(a == 0)
            return b;

        return gcd(b%a,a);
    }
}
