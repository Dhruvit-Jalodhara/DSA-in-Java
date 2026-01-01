package L01_Basics_Of_Java;

import java.util.Scanner;

public class C10_CharDtype {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'A';
        System.out.println(ch);

        // ASCII value
        int x = (int)ch; // explicit typecasting
        int y = ch;  // implicit typecasting
        System.out.println(x);
        System.out.println(y);

    }
}

