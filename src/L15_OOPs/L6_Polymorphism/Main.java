package L15_OOPs.L6_Polymorphism;

public class Main {
    public static void main(String[] args) {

        // UPCASTING : A superclass reference can refer to a subclass object.
        Shapes shape;

        /*
         =========================
         DYNAMIC METHOD DISPATCH
         =========================

         DEFINITION:
         Dynamic method dispatch is the mechanism by which
         a call to an overridden method is resolved at runtime.

         Decision is made based on OBJECT type, not reference type.
        */

        shape = new Circle();
        shape.area();   // Circle's area()

        shape = new Square();
        shape.area();   // Square's area()

        shape = new Triangle();
        shape.area();   // Triangle's area()

        /*
         NOTE:
         This is runtime polymorphism.
         Same reference, different behavior.
        */
    }
}
