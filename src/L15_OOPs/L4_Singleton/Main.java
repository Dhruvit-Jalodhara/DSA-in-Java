package L15_OOPs.L4_Singleton;



public class Main {

    public static void main(String[] args) {

        /*
        All calls return the SAME object reference
        No new object is created after first call
        */

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        /*
        Memory Explanation:
        - Only ONE Singleton object exists in HEAP
        - obj1, obj2, obj3 are references in STACK
        - All references point to the SAME object
        */
    }
}
