package L4_Patter_Printing;

import java.util.Scanner;

public class C23_NumberSpiral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        // Method 1 : concept -> min(i,j,2*n-i,2*n-j)
//        for (int i = 1; i <= 2*n-1; i++) { // lines
//            for (int j = 1; j <= 2*n-1; j++) {
//                System.out.print(Math.min(Math.min(i,j),Math.min(2*n-i,2*n-j)) + " ");
//            }
//            System.out.println();
//        }

        //Method 2 : concept -> symmetry + min()
        for (int i = 1; i <= 2*n-1; i++) {
            int x = i <= n ? i : 2*n-i; // here we make symmetry
            for (int j = 1; j <= 2*n-1; j++) {
                int y = j <= n ? j : 2*n-j; // here we make symmetry
                System.out.print(Math.min(x,y) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

