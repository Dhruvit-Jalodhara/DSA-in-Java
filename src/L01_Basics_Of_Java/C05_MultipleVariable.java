package L01_Basics_Of_Java;

public class C05_MultipleVariable {

    public static void main(String[] args) {
        int x = 5 , y = 8 , z = 10 ;
        System.out.println("value of x is " + x);
        System.out.println("value of y is " + y);
        System.out.println("value of z is " + z);

        // computer sees from left to right so which comes first that matter if string is first every thing
        // is string
        System.out.println("abc"+x+y+z);
        System.out.println(""+x+y+z);
        System.out.println(x+""+y+z);
        System.out.println(x+y+""+z);
        System.out.println(x+y+z+"");

        System.out.println("hello" + "Dhruvit");
    }
}

