package L15_OOPs.L6_Polymorphism;

/*
 =========================
 METHOD OVERLOADING
 =========================

 DEFINITION:
 Method overloading allows multiple methods
 with the same name but different parameter lists
 in the same class.

 This is COMPILE-TIME polymorphism.
*/
public class Numbers {

    double sum(double a, int b) {
        return a + b;
    }

    double sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        Numbers obj = new Numbers();

        /*
         Java selects the method based on argument list.
        */
        obj.sum(2, 3);
        obj.sum(1, 3, 7);

        /*
         Automatic type conversion:

         If exact match is not found,
         Java promotes int → double.
        */
//        obj.sum(4, 5, 6, 8); // ❌ no matching method
    }
}
