package L15_OOPs.L1_Introduction;

/*
 ===============================
 WRAPPER CLASSES
 ===============================

 Wrapper classes convert primitive data types into objects.

 Primitive  → Wrapper
 int        → Integer
 double     → Double
 char       → Character
 boolean    → Boolean

 Why Wrapper Classes?
 - Needed for Collections (ArrayList, HashMap)
 - Provide utility methods
 - Allow primitives to behave like objects

 Wrapper classes are:
 - Immutable
 - Final (cannot be inherited)
*/

public class WrapperExample {
    public static void main(String[] args) {

        // Primitive types
        int a = 10;
        int b = 20;

        System.out.println(a + " " + b);
        swap(a, b);
        System.out.println(a + " " + b); // no change (pass by value)

        // Wrapper objects
        Integer num1 = Integer.valueOf(45);
        Integer num2 = Integer.valueOf(65);

        System.out.println(num1 + " " + num2);
        swap(num1, num2);
        System.out.println(num1 + " " + num2); // no change

        /*
         Java is pass-by-value:
         - For primitives → value copied
         - For objects → reference copied
         Reassigning reference does not affect original object
        */

        // final with primitive
        final int BONUS = 20;
        // BONUS = 40; ❌ not allowed

        // final with object reference
        final A dhruvit = new A("Dhruvit Jalodhara");
        dhruvit.name = "dhruvit"; // allowed (object mutable)
        // dhruvit = new A("xyz"); ❌ reference reassignment not allowed

        // Object creation inside loop (eligible for GC)
        A obj;
        for (long i = 0; i < 1_000_000; i++) {
            obj = new A("random");
        }
    }

    // Primitives: changes only inside method
    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    // Wrapper objects: reference copied, reassignment ineffective
    private static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

/*
 ===============================
 FINAL KEYWORD
 ===============================

 final variable:
 - Primitive → value cannot change
 - Reference → reference cannot change, object may change

 final class:
 - Cannot be inherited (e.g., Integer, String)

 final method:
 - Cannot be overridden
*/

class A {

    final int num = 10; // constant
    String name;

    public A(String name) {
        this.name = name;
    }

    /*
     finalize():
     - Called by Garbage Collector before object removal
     - Execution NOT guaranteed
     - Deprecated (Java 9+)
     - Used only for learning purposes
    */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
