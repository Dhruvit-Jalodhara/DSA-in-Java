package L15_OOPs.L3_Static;

/*
STATIC — CORE DEFINITION :
static members belong to the CLASS, not to objects.
They are created once when the class is loaded into memory.

Non-static members belong to OBJECTS.
Each object gets its own copy.
*/

public class Human {

    /*
     NON-STATIC (Instance Members) : Object-level data , New copy is created for every object , Stored in Heap
     */
    int age;
    String name;
    int salary;
    boolean married;

    /*
     STATIC (Class-Level Member) : Single shared copy for entire class , Stored in Method Area / Metaspace
     */
    static long population;

    /*
    Constructor:
    - Runs every time an object is created
    - Initializes instance variables
    - Can access static members using class name
    */
    Human(String name, int age, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;

        // Correct way to access static variable
        Human.population += 1;
    }

    /*
    STATIC METHOD:
    - Belongs to class
    - Can be called without creating objects
    - Can access ONLY static members directly
    */
    static void message() {
        System.out.println("Hello !!");

        // ❌ Not allowed:
        // System.out.println(this.age);
        // 'this' refers to an object, but static context has no object
    }

    /*
    EXECUTION ORDER SUMMARY :

    1) STATIC CONTEXT (Once per class)
       Class Loaded → Static variables initialized → Static blocks executed →  Static methods usable

    2) NON-STATIC CONTEXT (Every object)
       new Object → Instance variables initialized → Constructor called → Instance blocks → Instance methods usable

    */
}
