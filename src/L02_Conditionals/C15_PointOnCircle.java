package L02_Conditionals;
import java.util.Scanner;
public class C15_PointOnCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the coordinates of centre (x,y) : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.print("Enter the radius of the circle : ");
        int r = sc.nextInt();

        System.out.print("Enter the coordinates of point (x1,y1) : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int d = (x-x1)*(x-x1) + (y-y1)*(y-y1);

        if(d > r*r)
            System.out.println("Point (x1,y1) lies outside the circle ");
        else if(d < r*r)
            System.out.println("Point (x1,y1) lies inside the circle ");
        else
            System.out.println("Point (x1,y1) lies on the circle ");

        sc.close();
    }

}








