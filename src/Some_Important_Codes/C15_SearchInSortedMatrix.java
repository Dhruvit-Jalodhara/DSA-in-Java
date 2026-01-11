package Some_Important_Codes;

public class C15_SearchInSortedMatrix {
    public static int[] search(int[][] arr, int target){
        int[] ans = {-1,-1};

        int rows = arr.length , cols = arr[0].length;
        int s = 0 , e = rows*cols - 1;

        while (s <= e){
            int m = (s + e)/2;
            int mrow = m/cols , mcol = m%cols ;

            if(arr[mrow][mcol] > target)
                e = m - 1;
            else if(arr[mrow][mcol] < target)
                s = m + 1;
            else {
                ans[0] = mrow;
                ans[1] = mcol;
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1 ,2 ,3 ,4 },
                {5 ,6 ,7 ,8 },
                {9 ,10,11,12},
                {13,14,15,16}
        };

        int[] ans = search(arr,10);
        System.out.println(ans[0] + " " + ans[1]);
    }
}