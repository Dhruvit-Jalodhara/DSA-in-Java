package L6_Arrays;

public class C16_MissingInArray {
//    int[] missingNum(int[] arr) {
//        int[] ans = new int[1];
//
//        for (int i = 1; i <= arr.length +1; i++) {
//            boolean flag = false;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j] == i){
//                    flag = true;
//                    break;
//                }
//            }
//            if(!flag) ans[0] = i;
//        }
//        return ans;
//    }
    public static int missingNum(int[] arr){
        long n = arr.length + 1;
        long sum = (n*(n+1))/2;
        long sumarr = 0;
        for(int x : arr){
            sumarr += x;
        }
        return (int)(sum - sumarr);
    }
    public static void main(String[] args) {

    }
}

