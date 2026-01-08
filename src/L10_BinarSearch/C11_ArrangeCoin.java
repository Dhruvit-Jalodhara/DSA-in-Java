package L10_BinarSearch;

public class C11_ArrangeCoin {
    public static int arrangeCoins(int n) {
        int ans = -1;
        int start = 1 , end = n;
        while(start <= end){
            int mid = start + (end - start) / 2;
            long sum = ((long)mid * (mid + 1))/2;

            if(sum > n){
                end = mid - 1;
            }else{
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
}
