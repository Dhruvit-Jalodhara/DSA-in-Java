package L4_Patter_Printing;

import java.util.Scanner;

public class C12_HollowRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle : ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of rectangle : ");
        int b = sc.nextInt();

        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= l; j++) {
                if(i==1 || j == 1 || i == b || j == l)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}

