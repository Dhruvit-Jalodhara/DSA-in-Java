package L02_Conditionals;

import java.util.Scanner;

public class C14_LieOnAxis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x and y : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x == 0 && y == 0)
            System.out.println("point (x,y) lies on the origin ");
        else if(x == 0)
            System.out.println("point (x,y) lies on the y-axis ");
        else if (y == 0)
            System.out.println("point (x,y) lies on the x-axis ");
        else
            System.out.println("point (x,y) does not  lies on axis ");


        sc.close();
    }
}

