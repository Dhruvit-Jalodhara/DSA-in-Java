package L06_Arrays;

//Q1 : Given an array of marks of students, if the mark of any student is less than 35 print its roll number.
//  [roll number here refers to the index of the array].

import java.util.Scanner;

public class C03_que1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students : ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the marks of student "+ (i+1) +" : ");
            marks[i] = sc.nextInt();
        }

        System.out.println("Roll number of students having marks less than 35 ");
        for (int i = 0; i < n; i++) {
            if(marks[i] < 35)
                System.out.println("Roll no : "+i);
        }

        sc.close();
    }
}

