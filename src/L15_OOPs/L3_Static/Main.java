package L15_OOPs.L3_Static;

public class Main {

    public static void main(String[] args) {

        // Objects created → constructor increments population
        Human dhruvit = new Human("Dhruvit", 21, 100000, false);
        Human rahul = new Human("Rahul", 34, 200000, true);

        // Same static variable accessed via different objects
        System.out.println(dhruvit.population);
        System.out.println(rahul.population);

        // fun() is static → can be called directly
        fun();
    }

    /*
    NON-STATIC METHOD:
    - Requires object
    - Can access both static & non-static members
    */
    void greeting() {
        System.out.println("hello!!");
    }

    /*
    STATIC METHOD:
    - No object exists here
    - Cannot access non-static members directly
    */
    static void fun() {
        System.out.println("hey its fun method");

        // Accessing non-static method using object reference
        Main obj = new Main();
        obj.greeting();
    }

    /*
    Instance methods can access BOTH static and non-static members
    because object already exists.

    Static methods can access ONLY static members directly
    because no object exists yet.
    */
}
