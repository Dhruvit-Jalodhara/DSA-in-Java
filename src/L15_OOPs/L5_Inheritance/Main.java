package L15_OOPs.L5_Inheritance;

public class Main {
    public static void main(String[] args) {

        Box box1 = new Box(3,4,5);
        box1.print();

        BoxWeight box2 = new BoxWeight(2,3,4,8);
        box2.print();

        /*
         ===================== UPCASTING =====================

         DEFINITION:
         Upcasting is the process of converting a subclass object reference into a superclass reference.
         It happens automatically (implicit casting).

         SYNTAX: SUPERCLASS ref = new SUBCLASS();
        */

        Box box3 = new BoxWeight(2,3,4,8);

        //  IMPORTANT RULE: Access is determined by reference type (Box), NOT by object type (BoxWeight).

        System.out.println(box3.height);

        /*
         System.out.println(box3.weight);

         ❌ NOT allowed

         Reason:
         Box reference does not know about 'weight'
         even though the actual object is BoxWeight.
        */

        /*
         plainbox   =   weightbox
         (parent)       (child)
        */

        /*
         ===================== INVALID CASE =====================

         BoxWeight box4 = new Box(2,3,4);

         ❌ ERROR

         Reason:
         Parent object cannot be assigned to child reference.
         Child expects more data than parent provides.
        */

        BoxPrice box5 = new BoxPrice(1,2,3,4,5);
        box5.print();
    }
}
