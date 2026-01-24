package Questions;

public class Q29_Floor_Ceiling {
    public static int[] getFloorAndCeil(int[] nums, int target) {
        int[] ans = new int[2];

        ans[0] = floor(nums,target);
        ans[1] = ceil(nums,target);

        return ans;
    }

    public static int floor(int[] nums, int target) {
        int ans = -1;
        int start = 0 , end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] <= target){
                ans = nums[mid];
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int ceil(int[] nums, int target) {
        int ans = -1;
        int start = 0 , end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] >= target){
                ans = nums[mid];
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,4,7,8,10};
        int[] ans = getFloorAndCeil(arr,5);

        System.out.println("Floor : " + ans[0]);
        System.out.println("ceil : " + ans[1]);
    }
}
