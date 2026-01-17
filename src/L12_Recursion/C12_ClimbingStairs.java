package L12_Recursion;

public class C12_ClimbingStairs {
//    public static int climbStairs(int n) {
//        int ways = 0;
//
//        for(int twoSteps = 0; twoSteps <= n / 2; twoSteps++){
//            int oneSteps = n - 2 * twoSteps;
//            int totalMoves = oneSteps + twoSteps;
//
//            ways += nCr(totalMoves, twoSteps);
//        }
//        return ways;
//    }

    public static int climbStairs(int n) {
        int oneSteps = n, twoSteps = 0;
        int count = 0;

        while(oneSteps >= 0){

            // total moves = oneSteps + twoSteps
            count += nCr(oneSteps + twoSteps, twoSteps);

            // replace two 1-steps with one 2-step
            oneSteps -= 2;
            twoSteps += 1;
        }
        return count;
    }
    public static int nCr(int n, int r){
        r = Math.min(r, n - r);
        long res = 1;

        for(int i = 1; i <= r; i++){
            res = res * (n - i + 1) / i;
        }
        return (int)res;
    }



//    public static long nCr(long n, long r){
//        if(r == 0 || r == n)
//            return 1;
//
//        return (nCr(n, r -1) * (n - r + 1))/ r;
//    }

//    public static int climbStairs(int n) {
//        if(n <= 2)
//            return n;
//
//        // From the first step, we have two choices:
//        // take 1 step (solve for n-1) or take 2 steps (solve for n-2),
//        // so total ways = ways(n-1) + ways(n-2)
//        return climbStairs(n - 1) + climbStairs(n - 2);
//    }


    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }
}
