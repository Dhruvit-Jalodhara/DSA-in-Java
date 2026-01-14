package L11_Strings;

import java.lang.reflect.Array;

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

        // string to integer
        String str = "123";
        int x = Integer.parseInt(str);
        System.out.println(x + 1);

        // in built method :-> we use this most of time
        int n = 123;
        String s3 = Integer.toString(n);
        System.out.println(s3);

        // String to char array
        String s4 = "Dhruvit";
        char[] arr = s4.toCharArray();
        for(char ele : arr) System.out.print(ele + "  ");
        System.out.println();


        //substring
        String s5 = "Jaishankar";
        System.out.println(s5.substring(3));
        System.out.println(s5.substring(1,5)); // print from index 1 to 4 {here last index is excluded}

    }
}
