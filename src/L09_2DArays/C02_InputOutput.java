package L09_2DArays;

import java.util.Scanner;

public class C02_InputOutput {
    public static void output(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void input(int[][] arr){
        Scanner sc = new Scanner(System.in);

        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        output(arr);
        input(arr);
        output(arr);
    }
}
