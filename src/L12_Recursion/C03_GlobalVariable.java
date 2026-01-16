package L12_Recursion;

public class C03_GlobalVariable {

    static int x = 10; // global variable

    public static void main(String[] args) {

        fun();
        System.out.println(x);

        // it is local variable of same name as global.
        // from now on, it will consider this.
        // local variable has more preference than global variable
        int x = 15;
        System.out.println(x);

        x = 12; // this x is still local
    }

    public static void fun() {

        // here a is local variable.
        // its scope is only inside the fun method, cannot access outside it
        int a = 3;
        System.out.println(a);

        // here x is global variable,
        // so it can be accessed in whole class
        System.out.println(x);

        x = 20; // modifying global variable
    }
}
