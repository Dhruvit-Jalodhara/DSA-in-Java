package Questions;

public class Q17_LeetCode1299 {
    public static void print(int[] arr){
            for(int x : arr){
                System.out.print(x + " ");
            }
            System.out.println();
    }

    // method 1:
//    public static int[] replaceElements(int[] arr) {
//        int n = arr.length;
//        int[] ans = new int[n];
//
//        ans[0] = -1;
//        int max = arr[n-1];
//        for (int i = n-1; i >= 1; i--) {
//            if(arr[i] >= max){
//                max = arr[i];
//                ans[n-i] = max;
//            }else{
//                ans[n-i] = max;
//            }
//        }
//        int i = 0 , j = n-1;
//        while(i <= j){
//            int temp = ans[i];
//            ans[i] = ans[j];
//            ans[j] = temp;
//            i++;
//            j--;
//        }
//        return ans;
//    }

    // method 2 :
    public static int[] replaceElements(int[] arr){
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = max;
            max = arr[i]>max ? arr[i] : temp ;
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};

        print(arr);
        int[] ans = replaceElements(arr);
        print(ans);
    }
}
