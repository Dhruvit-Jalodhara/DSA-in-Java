package L09_2DArays;

public class C08_ForEachLoop {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};

//        for (int i = 0; i < arr.length; i++) {
//            for(int x : arr[i])
//                System.out.print(x + " ");
//            System.out.println();
//        }

        for(int[] a : arr){
            for(int x : a){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
