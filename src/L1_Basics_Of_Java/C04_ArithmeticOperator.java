package L1_Basics_Of_Java;

public class C04_ArithmeticOperator {
    public static void main(String[] args) {
        // Arithmetic operations on int data type
        int x = 5;
        int y = 3;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);

        //modules operator : it returns remainder
        // a % b where a>b it gives remainder
        // when a < b : a % b = a
        // a % -b = a % b
        System.out.println(x%y);

    }
}
