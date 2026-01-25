package L15_OOPs.L5_Inheritance;

/*
 ============================================================
 INHERITANCE DEMO FILE
 Covers:
 - extends keyword
 - single & multi-level inheritance
 - upcasting
 - super keyword (constructor + member access)
 - constructor chaining
 - final variable, method, class
 - static methods & method hiding
 - polymorphism rules
 ============================================================
*/

/*
 -------------------------
 SUPERCLASS
 -------------------------
*/
class Animal {

    /*
     final variable (constant)

     DEFINITION:
     A final variable cannot be reassigned once initialized.
    */
    final String TYPE = "Living Being";

    String name;

    /*
     Constructor
    */
    Animal(String name) {
        this.name = name;
    }

    /*
     final method

     DEFINITION:
     A final method cannot be overridden.
     Enables early (compile-time) binding.
    */
    public final void breathe() {
        System.out.println("Animal is breathing");
    }

    /*
     Normal method (can be overridden)
    */
    public void sound() {
        System.out.println("Animal makes sound");
    }

    /*
     static method

     NOTE:
     Static methods belong to class, not object.
     They are NOT overridden, only hidden.
    */
    public static void category() {
        System.out.println("Category: Animal");
    }
}

/*
 -------------------------
 SUBCLASS
 -------------------------
*/
class Dog extends Animal {

    String breed;

    /*
     Constructor using super()

     NOTE:
     super() calls immediate parent constructor.
     Parent initialization happens first.
    */
    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    /*
     Method overriding (runtime polymorphism)
    */
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    /*
     Static method hiding (NOT overriding)
    */
    public static void category() {
        System.out.println("Category: Dog");
    }
}

/*
 -------------------------
 FINAL CLASS
 -------------------------
*/
final class Robot {

    /*
     final class

     DEFINITION:
     A final class cannot be inherited.
     All its methods become implicitly final.
    */

    public void work() {
        System.out.println("Robot is working");
    }
}

/*
 -------------------------
 MAIN CLASS
 -------------------------
*/
public class InheritanceDemo {

    public static void main(String[] args) {

        /*
         =========================
         UPCASTING
         =========================

         DEFINITION:
         Upcasting is assigning a subclass object
         to a superclass reference.

         Syntax:
         SUPERCLASS ref = new SUBCLASS();

         It is implicit and always safe.
        */
        Animal a = new Dog("Bruno", "Labrador");

        /*
         ACCESS RULE:
         Access depends on reference type (Animal),
         not object type (Dog).
        */
        System.out.println(a.name);     // allowed
        // System.out.println(a.breed); // ❌ not allowed

        /*
         Runtime polymorphism:
         Method call depends on object type.
        */
        a.sound();   // Dog barks

        /*
         final method :
         Cannot be overridden, always runs parent version.
        */
        a.breathe();

        /*
         =========================
         STATIC METHOD RULE
         =========================

         Static method call depends on reference type,
         NOT object type.
        */
        a.category();        // Category: Animal
        Dog.category();      // Category: Dog
        Animal.category();   // Category: Animal

        /*
         =========================
         INVALID CASES (THEORY)
         =========================

         Dog d = new Animal("Tom");   ❌
         Parent object cannot be assigned to child reference.

         class X extends A, B         ❌
         Java does NOT support multiple inheritance.

         class A extends A            ❌
         A class cannot inherit itself.
        */
    }
}
