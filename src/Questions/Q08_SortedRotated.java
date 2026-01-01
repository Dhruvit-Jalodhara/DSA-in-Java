package Questions;
//leetcode no : 1752
public class Q08_SortedRotated {
    public void reverse(int[] arr , int s, int e){
        int i = s , j = e;
        while( i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    public void rotate(int[] arr,int k){
        int n = arr.length;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public boolean check(int[] nums) {
        //method 1:
//        int i = 1;
//        while(i < nums.length){
//            if(nums[i] < nums[i-1])
//                break;
//            i++;
//        }
//        if(i< nums.length){
//            rotate(nums, nums.length-i);
//            for (int j = 1; j < nums.length; j++) {
//                if(nums[j] < nums[j-1])
//                    return false;
//            }
//        }
//        return true;

        //method 2 (by gpt)
        int count = 0;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1])
                count++;
        }

        // check last and first element
        if (nums[0] < nums[n - 1])
            count++;

        return count <= 1;
    }
    public static void main(String[] args) {

    }
}

