package L2_Conditionals;
import java.util.Scanner;
public class C12_SideOfTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the A side : ");
        int a = sc.nextInt();
        System.out.print("Enter the B side : ");
        int b = sc.nextInt();
        System.out.print("Enter the C side : ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && a+c>b)
            System.out.println("A,B,C are valid length of side for triangle");
        else
            System.out.println("A,B,C are not valid length of side for triangle");
    }
}

