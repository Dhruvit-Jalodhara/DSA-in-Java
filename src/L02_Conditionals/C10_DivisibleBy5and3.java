package L02_Conditionals;
import java.util.Scanner;
public class C10_DivisibleBy5and3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        // number divisible by both 5 and 3
        if(num % 5 == 0 && num % 3 == 0)
            System.out.println("Number is divisible by  3 and 5 ");
        else
            System.out.println("Number is not divisible 3 and 5");

        // number divisible by 5 but not 3
//        if(num % 5 == 0 && num % 3 != 0)
//            System.out.println("Number is divisible by 5 but not 3");
//        else
//            System.out.println("Number is not only divisible by 5");

        // number divisible by 5 or 3
//        if(num % 5 == 0 || num % 3 == 0)
//            System.out.println("Number is divisible by  3 or 5 ");
//        else
//            System.out.println("Number is not divisible 3 or 5");


        sc.close();
    }
}

