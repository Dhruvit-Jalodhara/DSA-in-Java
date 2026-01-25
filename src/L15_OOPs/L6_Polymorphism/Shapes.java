package L15_OOPs.L6_Polymorphism;

/*
 DEFINITION:
 Polymorphism means "many forms".
 In Java, it is achieved mainly using method overriding and dynamic method dispatch.
*/
public class Shapes {

    /*
     This method will be overridden in subclasses.

     NOTE:
     - This is a normal instance method
     - Hence, it supports runtime polymorphism
    */
    void area() {
        System.out.println("I am in shapes");
    }

    /*
     EARLY BINDING (Compile-time binding):

     If this method is declared final, it CANNOT be overridden.
     Hence, method call is resolved at compile time.

     Uncomment to test early binding.
    */
//    final void area() {
//        System.out.println("I am in shapes");
//    }
}
