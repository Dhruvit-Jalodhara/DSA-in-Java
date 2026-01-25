package L15_OOPs.L3_Static;

/*
CLASS WITH STATIC VARIABLE (Test2) : Static variable → shared across all objects
*/
class Test2 {

    static String name;

    public Test2(String name) {
        Test2.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}


public class InnerClasses {

    /*
        STATIC INNER CLASS (Test1) :
        - Does NOT belong to any object of outer class
        - Behaves like a normal top-level class
        - Can be instantiated without outer class object
    */
    static class Test1 {
        String name;

        public Test1(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    /*
    ==============================
    DIFFERENCE: Test1 vs Test2
    ==============================

    Test1:
    - Static INNER class
    - 'name' is NON-static
    - Each object has its own copy

    Test2:
    - Normal class
    - 'name' is STATIC
    - All objects share same variable
    */

    public static void main(String[] args) {

        // Objects of static inner class
        Test1 a1 = new Test1("Dhruvit");
        Test1 b1 = new Test1("Rahul");

        // Different outputs → separate instance variables
        System.out.println(a1.name); // Dhruvit
        System.out.println(b1.name); // Rahul


        // Objects of class with static variable
        Test2 a2 = new Test2("Pratik");
        Test2 b2 = new Test2("Gourav");

        /*
        WHY SAME OUTPUT?

        - name is STATIC in Test2
        - a2.name and b2.name refer to SAME memory
        - Last assignment overwrites previous value
        */
        System.out.println(a2.name); // Gourav
        System.out.println(b2.name); // Gourav
    }
}

/*
===============================
COMPILE TIME vs RUN TIME
===============================

COMPILE TIME:
- Java code is checked for syntax
- .class file is generated
- NO objects are created
- NO memory is allocated in Heap or Stack

RUN TIME:
- JVM loads .class file
- Memory is allocated
- Objects are created in Heap
- References are stored in Stack
*/


/*
===============================
OBJECT & REFERENCE CREATION
===============================

Statement:
    Test2 a2 = new Test2("Pratik");

STEP 1 (Run Time):  Space for reference variable `a2` is created in STACK

STEP 2 (Run Time):  `new Test2("Pratik")` creates an object in HEAP

STEP 3 (Run Time):  Address of HEAP object is stored inside STACK reference `a2`

IMPORTANT:
- Reference lives in STACK
- Actual object lives in HEAP
*/


/*
===============================
SECOND OBJECT CREATION
===============================

Statement:
    Test2 b2 = new Test2("Gourav");

- New reference `b2` is created in STACK
- New object is created in HEAP
- `b2` stores address of second HEAP object
*/


/*
===============================
STATIC VARIABLE BEHAVIOR
===============================

- Static variables are created when class is loaded (RUN TIME)
- Stored in Method Area (Metaspace)
- Only ONE copy exists
- All objects share the same static variable

In Test2:
- `name` is static
- Constructors overwrite the SAME memory location
*/


/*
===============================
WHY SAME OUTPUT PRINTS
===============================

System.out.println(a2.name);
System.out.println(b2.name);

- `name` does NOT belong to object
- Both a2 and b2 point to same static variable
- Last assigned value is printed
*/


/*
===============================
MEMORY CLEANUP
===============================

- STACK memory is cleared when method ends
- HEAP objects are removed later by Garbage Collector
- Static variables live until class is unloaded
*/

