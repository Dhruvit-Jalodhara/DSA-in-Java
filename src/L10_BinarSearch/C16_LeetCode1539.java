package L10_BinarSearch;

public class C16_LeetCode1539 {
    public static int findKthPositive(int[] arr, int k) {
        int s = 0 , e = arr.length - 1;
        while(s <= e){
            int m = (s + e) / 2;
            int correct = m + 1;
            int missing = arr[m] - correct ;

            if(missing < k)
                s = m + 1;
            else
                e = m - 1;
        }
        return (e + 1 + k);
    }
}
