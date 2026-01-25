package L15_OOPs.L5_Inheritance;

/*
 Subclass of Box

 DEFINITION:
 Inheritance allows a class to acquire the properties and behavior
 of another class using the keyword 'extends'.

 NOTE:
 Java supports SINGLE inheritance only.
*/
public class BoxWeight extends Box {

    double weight;

    /*
     Default constructor

     super() calls the immediate superclass constructor (Box).
     If not written, Java automatically calls it.
    */
    BoxWeight(){
        super();
        this.weight = -1;
    }

    // Constructor for cube with weight.
    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    /*
     Constructor with full dimensions and weight.

     DEFINITION:
     super() is used to call the constructor of the immediate parent class.
     Parent initializes its own variables, child initializes its own.
    */
    BoxWeight(double height, double length, double width, double weight) {
        super(height, length, width);
        this.weight = weight;
    }

    /*
     Copy constructor

     NOTE:
     Even though 'other' is BoxWeight, Box constructor copies
     only Box members (height, length, width).
    */
    BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }


    @Override
    public void print() {
        super.print();
        System.out.println("Weight : " + this.weight);
    }
}
