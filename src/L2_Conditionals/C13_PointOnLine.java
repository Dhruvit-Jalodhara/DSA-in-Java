package L2_Conditionals;
import java.util.Scanner;
public class C13_PointOnLine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x1 and y1 : ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter the x2 and y2 : ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Enter the x3 and y3 : ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y3-y2)/(x3-x2);

        if(m1 == m2){
            System.out.println("(x1,y1) , (x2,y2) , (x3,y3) are on same line");
        }else{
            System.out.println("(x1,y1) , (x2,y2) , (x3,y3) are not same line");
        }

        sc.close();
    }
}

