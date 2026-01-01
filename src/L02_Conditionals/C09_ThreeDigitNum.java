package L02_Conditionals;
import java.util.Scanner;
public class C09_ThreeDigitNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if(num > 99 && num < 1000)
            System.out.println("Number is three digit ");
        else
            System.out.println("Number is not three digit ");

        sc.close();
    }
}

