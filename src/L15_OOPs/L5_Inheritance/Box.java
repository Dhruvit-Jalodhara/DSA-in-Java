package L15_OOPs.L5_Inheritance;

/*
 Superclass (Base class)

 DEFINITION:
 A superclass is a class whose properties and methods are inherited by another class.
 Every class in Java implicitly extends the Object class.
*/
public class Box {

    /*
     NOTE:
     Polymorphism does NOT apply to instance variables.
     Variable access depends on reference type, not object type.
    */
    double height;
    double length;
    double width;

    /*
     Default constructor

     If super() is not written explicitly, Java automatically inserts it.
     Here super() refers to Object class constructor.
    */
    Box(){
        super();
        this.height = -1;
        this.length = -1;
        this.width = -1;
    }

    /*
     Cube constructor
     Used when all sides are equal.
    */
    Box(double side){
        this.height = side;
        this.length = side;
        this.width = side;
    }

    /*
     Parameterized constructor
     Initializes box with custom dimensions.
    */
    Box(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    /*
     Copy constructor

     DEFINITION:
     A copy constructor creates a new object by copying the state
     of another object of the same or derived type.
    */
    Box(Box old){
        this.height = old.height;
        this.length = old.length;
        this.width = old.width;
    }

    // Can be overridden unless declared final.
    public void info(){
        System.out.println("Box is running");
    }


    public void print(){
        System.out.println("Height : " + this.height);
        System.out.println("Length : " + this.length);
        System.out.println("Width : " + this.width);
    }
}
