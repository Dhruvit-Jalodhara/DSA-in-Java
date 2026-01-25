package L15_OOPs.L6_Polymorphism;

/*
 Method overriding occurs when a subclass provides
 a specific implementation of a method already defined in its superclass.
*/
public class Circle extends Shapes {

    /*
     OVERRIDING RULES:
     - Method name must be same
     - Parameters must be same
     - Return type can be same OR subclass type (covariant return)
     - Access level cannot be more restrictive
    */
    @Override
    void area() {
        System.out.println("Area is pi * r * r");
    }
}
