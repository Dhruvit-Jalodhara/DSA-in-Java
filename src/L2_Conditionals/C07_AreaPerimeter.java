package L2_Conditionals;
import java.util.Scanner;
public class C07_AreaPerimeter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of rectangle : ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of rectangle : ");
        int b = sc.nextInt();

        int area = l * b;
        int perimeter = 2 * ( l + b );

        if(area > perimeter){
            System.out.println("Area is greater than Perimeter");
        }else if(area < perimeter){
            System.out.println("Area is less than Perimeter");
        }else{
            System.out.println("Area is equal to Perimeter");
        }
        sc.close();
    }
}

