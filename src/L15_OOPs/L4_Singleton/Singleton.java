package L15_OOPs.L4_Singleton;

/*
=====================================
SINGLETON CLASS
=====================================

Definition:
A Singleton class allows ONLY ONE object
to be created during the entire program execution.
*/

public class Singleton {

    /*
    PRIVATE CONSTRUCTOR:
    - Prevents object creation using `new` from outside the class
    - Ensures no other class can create an instance directly
    */
    private Singleton() {

    }

    /*
    STATIC INSTANCE VARIABLE:
    - Belongs to the class, not to objects
    - Stores the single allowed object
    - Initially null (no object created yet)
    */
    private static Singleton instance;

    /*
    PUBLIC STATIC METHOD:
    - Provides global access point to the single object
    - Called using class name: Singleton.getInstance()
    */
    public static Singleton getInstance() {

        /*
        Lazy Initialization:
        - Object is created ONLY when needed
        - First call → instance is null → object created
        - Next calls → same object returned
        */
        if (instance == null) {
            instance = new Singleton(); // object created in HEAP
        }

        // Returns the SAME object every time
        return instance;
    }
}
