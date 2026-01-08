package L09_BinarSearch;

public class C05_FloorNumber {
    public static int findFloor(int[] arr, int x) {
        int ans = -1;
        int start = 0 , end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > x){
                end = mid - 1;
            }else{
                start = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4,15,17,17,19,20,21,22,22,25,26,26,26,28,28,28,31,31,32,33,34,34,35,36,36,37,38,38,39,41,41,42,43,43,44,44,45,45,46,47,49,49,50,50,50,51,53,54,54,56,57,58,58,59,60,64,67,69,79,94};
        System.out.println(findFloor(arr,26));
    }
}
