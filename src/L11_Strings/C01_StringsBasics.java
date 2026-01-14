package L11_Strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_StringsBasics {
    public static void main(String[] args) {
//        char[] arr = {'d','h','r','u','v','i','t'};
//        for(char ele : arr){
//            System.out.print(ele + " ");
//        }

//        String str = "good morning!!";
//        System.out.println(str);

        Scanner sc = new Scanner(System.in);

//        System.out.print("enter the string 1 : ");
//        String s1 = sc.nextLine(); // sc.nextLine() -> doesread after space
//        System.out.println("string 1 : " + s1);
//
//        System.out.print("enter the string 2 : ");
//        String s2 = sc.next(); // sc.next() -> does not read after space (at whitespace it will stop)
//        System.out.println("string 2 : " + s2);


        String str = "Dhruvit Jalodhara";
        System.out.println(str.charAt(5)); // str[5]
        System.out.println(str.length());
    }
}
