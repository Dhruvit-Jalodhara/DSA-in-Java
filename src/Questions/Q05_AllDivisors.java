package Questions;

import java.util.ArrayList;
import java.util.List;

public class Q05_AllDivisors {
    public static void divisors(int n){
        // method 1 (brute force)
//        for (int i = 1; i <= n; i++) {
//            if(n % i == 0){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

        // method 2 (optimize) : here we use i*i <= n loop runs sqrt(n) time
        // 36 : 1 2 3 4 6 9 12 18 36 : if i is divior on n the n/i is also divisor of n

        List<Integer> temp = new ArrayList<>();
        for (int i = 1; i*i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");

                if(i != n / i){
                    temp.add(n / i);
                }
            }
        }
        for (int i = temp.size() - 1; i >= 0; i--) {
            System.out.print(temp.get(i) + " ");
        }


    }
    public static void main(String[] args) {
        divisors(36);
    }
}

