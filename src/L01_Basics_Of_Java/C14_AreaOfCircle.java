package L01_Basics_Of_Java;
import java.util.Scanner;
public class C14_AreaOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius,pi,area;

        System.out.print("enter the radius of circle : ");
        radius = sc.nextInt();

        pi = 3.1415;
        area = pi * radius * radius;

        System.out.println("the area of circle is : "+area);

        sc.close();
    }
}

