package L09_2DArays;


// for Square matrix only
public class C12_TransposeMatrix {
    public static void print(int[][] arr){
        for(int[] a : arr){
            for(int x : a){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int[][] transpose(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;

        int[][] ans = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
             ans[j][i] = arr[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};

        print(arr);

        int[][] ans = transpose(arr);

        print(ans);
    }
}
