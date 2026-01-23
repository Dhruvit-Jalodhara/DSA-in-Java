package L10_BinarySearch;

public class C07_FloorSqrt {
    public static int floorSqrt(int n) {
        int ans = 0;
        int start = 1 , end = n;
        while(start <= end){
            int mid = start + (end - start) / 2;
            long sq = (long)mid * (long)mid;
            if(sq > n){
                end = mid - 1;
            }else if(sq < n){
                ans = mid;
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(floorSqrt(8));
    }
}
