package L15_OOPs.L5_Inheritance;

/*
 Multi-level inheritance example

 Hierarchy:
 Box → BoxWeight → BoxPrice
*/
public class BoxPrice extends BoxWeight {

    double cost;

    /*
     Default constructor

     Constructor execution order:
     Box → BoxWeight → BoxPrice
    */
    BoxPrice(){
        super();
        this.cost = -1;
    }

    // Constructor with cube, weight, and cost.
    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }

    /*
     Constructor with full dimensions, weight, and cost.

     NOTE:
     super() always refers to the immediate parent class only.
    */
    public BoxPrice(double height, double length, double width, double weight, double cost) {
        super(height, length, width, weight);
        this.cost = cost;
    }


    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }


    @Override
    public void print() {
        super.print();
        System.out.println("Cost : " + this.cost);
    }
}
