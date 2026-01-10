package L09_2DArays;

public class C17_SpirallyTraversing {
    public static void print(int[][] arr){
        for(int[] a : arr){
            for(int x : a){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30}
        };

        int firstRow = 0, lastRow = arr.length - 1;
        int firstCol = 0, lastCol = arr[0].length - 1;
        // fr -> first row , lr -> last row , fc -> first col , lc -> last col

        while (firstRow <= lastRow && firstCol <= lastCol) {

            // top row →
            for (int j = firstCol; j <= lastCol; j++)
                System.out.print(arr[firstRow][j] + " ");
            firstRow++;
            if(firstRow > lastRow || firstCol > lastCol) break;

            // right column ↓
            for (int i = firstRow; i <= lastRow; i++)
                System.out.print(arr[i][lastCol] + " ");
            lastCol--;
            if(firstRow > lastRow || firstCol > lastCol) break;

            // bottom row ←
            for (int j = lastCol; j >= firstCol; j--)
                System.out.print(arr[lastRow][j] + " ");
            lastRow--;
            if(firstRow > lastRow || firstCol > lastCol) break;

            // left column ↑
            for (int i = lastRow; i >= firstRow; i--)
                System.out.print(arr[i][firstCol] + " ");
            firstCol++;
        }
    }

}
