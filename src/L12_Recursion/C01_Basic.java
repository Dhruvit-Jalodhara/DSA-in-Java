package L12_Recursion;

public class C01_Basic {
    public static void main(String[] args) {
        greet(1);
    }
    public static void greet(int n){
        if(n > 10)  return;     // Base Case : termination case
        System.out.println(n + " Good Morning!!");      // work
        greet(n + 1);       // Recursive Call
    }
}
