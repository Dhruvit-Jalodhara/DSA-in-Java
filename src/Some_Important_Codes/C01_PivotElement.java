package Some_Important_Codes;


// here pivot == largest element in array
public class C01_PivotElement {
    public static int findPivot(int[] arr){
        int start = 0, end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[end])
                start = mid + 1;
            else
                end = mid;
        }
        return start - 1; // pivot index
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }
}
