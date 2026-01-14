package L11_Strings;

public class C06_CompareToMethod {
    public static void main(String[] args) {
        String s1 = "dhruvit";
        String s2 = "mkaniuyf";

        // s1.compareTo(s2) returns an int by comparing characters
        // using their ASCII/Unicode values, element by element (Internally : (s1.charAt(i) - s2.charAt(i)) )
        // s1.compareTo(s2) < 0 -> s1 comes before s2 in dictionary order
        // s1.compareTo(s2) > 0 -> s2 comes before s1 in dictionary order
        // s1.compareTo(s2) = 0 -> s1 and s2 are equal


        System.out.println(s1.compareTo(s2));
    }
}
