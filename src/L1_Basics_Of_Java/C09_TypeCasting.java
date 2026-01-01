package L1_Basics_Of_Java;

public class C09_TypeCasting {

    public static void main(String[] args) {
        // implicit typecasting : smaller datatype -> bigger datatype
        int a = 5;
        double b = a;
        System.out.println(a);
        System.out.println(b);

        // explicit typecasting : bigger datatype -> smaller datatype
        // here data loss happen
        double x = 3.14;
        int y = (int)x;
        System.out.println(x);
        System.out.println(y);

        // integer to char
        int z = 67;
        System.out.println((char)z);
    }
}

