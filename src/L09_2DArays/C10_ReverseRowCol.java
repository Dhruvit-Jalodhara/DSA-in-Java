package L09_2DArays;

public class C10_ReverseRowCol {
    public static void revRowCol(int[][] arr){
        // reverse rows
        for (int i = 0; i < arr.length; i++) {
            int s = 0 , e = arr[0].length-1;
            while(s <= e){
                int temp = arr[i][s];
                arr[i][s] = arr[i][e];
                arr[i][e] = temp;
                s++;
                e--;
            }
        }
        // reverse cols
        for (int i = 0; i < arr[0].length; i++) {
            int s = 0 , e = arr.length-1;
            while(s <= e){
                int temp = arr[s][i];
                arr[s][i] = arr[e][i];
                arr[e][i] = temp;
                s++;
                e--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};

        for(int[] a : arr){
            for(int x : a){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();

        revRowCol(arr);

        for(int[] a : arr){
            for(int x : a){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
