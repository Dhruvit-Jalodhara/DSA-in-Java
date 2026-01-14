package L11_Strings;

public class C05_BuiltInMethod {
    public static void main(String[] args) {
        String s = "Dhruvit Jalodhara";

        System.out.println(s.indexOf('v'));
        System.out.println(s.indexOf('a')); // return index of first occurrence
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.indexOf('y')); // if not found return -1

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println(s.contains("Dhruv")); // checks substring

        System.out.println(s.startsWith("Dh")); // checks string start with given substring
        System.out.println(s.endsWith("ya")); // checks string ends with given substring


        s.toLowerCase(); // it does not change the string its return new string because string is immutable
        System.out.println(s);

        String s1 = "dhruvit ";
        String s2 = "Jalodhara";

        System.out.println(s1.concat(s2));
    }
}
