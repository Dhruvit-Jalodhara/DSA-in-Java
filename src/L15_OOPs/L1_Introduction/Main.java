package L15_OOPs.L1_Introduction;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Reference variable declaration (stored in stack)
        Student dhruvit;

        // Object creation using new (object stored in heap)
        dhruvit = new Student();

        /*
         new keyword:
         - Allocates memory at runtime (heap)
         - Calls the constructor
         - Returns a reference to the object
        */

        // Declaration + initialization in one line
        Student s1 = new Student();

        // Prints default reference info (class name + hashcode)
        System.out.println(s1);

        // Object state set by default constructor
        s1.printDetail();

        // Updating object state using reference
        s1.rollNo = 24;
        s1.name = "Dhruvit Jalodhara";
        s1.marks = 87.94f;

        // Object created using parameterized constructor
        Student s2 = new Student(24, "Dhruvit Jalodhara", 87.5f);
        s2.printDetail();

        // Object created using copy constructor
        Student s3 = new Student(s2);
        s3.printDetail();

        // Reference copying (no new object created)
        Student one = new Student();
        Student two = one;

        // Both references point to the same object
        one.printDetail();
        two.name = "one -> two";
        one.printDetail(); // change reflects in both
    }
}

/*
 ===============================
 CORE OOP DEFINITIONS
 ===============================

 Class:
 - Blueprint/template
 - Logical entity
 - Does not occupy memory

 Object:
 - Instance of a class
 - Physical entity (occupies heap memory)

 Instance:
 - Actual object created using new

 Instance Variables:
 - Variables that belong to an object
 - Each object has its own copy

 Object Properties:
 1. State    → instance variables
 2. Identity → memory location
 3. Behavior → methods

 Memory:
 - Stack → reference variables
 - Heap  → objects

 Reference:
 - Stores address of object
 - Used to access object members

 Dot (.) Operator:
 - Connects reference with instance variables/methods

 Safety:
 - Java uses references, not pointers
 - References cannot be manipulated like integers
*/

class Student {

    // Instance variables (state)
    int rollNo;
    String name;
    float marks;

    /*
     Constructor:
     - Special method used to initialize an object
     - Name must be same as class name
     - Has no return type (not even void)
     - Automatically called when object is created using new
    */

    // Default constructor
    // Provided automatically if no constructor is defined
    Student() {

        // Constructor chaining:
        // One constructor calling another constructor of same class
        this(13, "default person", 100.0f);
    }

    /*
     Parameterized Constructor:
     - Accepts values during object creation
     - Used to initialize object with custom data
     - this keyword refers to current object
    */
    Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    /*
     Copy Constructor:
     - Creates a new object by copying data from another object
     - Java does NOT provide a built-in copy constructor
     - Only data is copied, not reference
    */
    Student(Student other) {
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.marks = other.marks;
    }

    /*
     Method:
     - Defines behavior of an object
     - Operates on instance variables
     - Called using object reference
    */
    public void printDetail() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
        System.out.println();
    }
}
