package L11_Strings;


// string is immutable , string does pass by value not pass by reference
public class C04_PassStringToMethods {
    public static void change(String str){
        str = "abcd";
    }
    public static void main(String[] args) {
        String str = "dhruvit";

        System.out.println(str);
        change(str);
        System.out.println(str);
    }
}
