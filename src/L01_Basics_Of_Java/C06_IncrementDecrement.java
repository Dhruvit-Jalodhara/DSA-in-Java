package L01_Basics_Of_Java;

public class C06_IncrementDecrement {

    public static void main(String[] args) {
        int x = 5 , y = 7;
        System.out.println("value of x : "+x);
        x++; // post increment :  use x first then increase by +1
        System.out.println(x);
        x--; // post decrement : use x first then decrease by -1
        System.out.println(x);

        System.out.println("value of y : "+y);
        ++y; // pre increment :  first increase by +1 then use y
        System.out.println(y);
        --y; // pre decrement : first decrease by -1 then use y
        System.out.println(y);
    }
}

