package L2_Conditionals;
import java.util.Scanner;
public class C08_StudentGrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of student : ");
        int marks = sc.nextInt();

        if(marks > 90)
            System.out.println("Excellent");
        else if(marks > 80)
            System.out.println("Very Good");
        else if(marks > 70)
            System.out.println("Good");
        else if(marks > 60)
            System.out.println("can do better");
        else if(marks > 50)
            System.out.println("Average");
        else if(marks > 40)
            System.out.println("Below average");
        else
            System.out.println("Fail");

        sc.close();
    }
}

