package L15_OOPs.L3_Static;

/*
STATIC INITIALIZATION BLOCK (SIB):

- Executes ONCE when class is loaded
- Used to initialize complex static data
- Runs BEFORE main()
*/

public class StaticBlock {

    static int a = 4;
    static int b;

    // Runs only once — when class is loaded
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {

        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        /*
        Creating objects does NOT re-run static blocks.
        Static blocks run only once per class loader.
        Static block will NOT run again
        */
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
