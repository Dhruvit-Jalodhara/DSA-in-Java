package L11_Strings;

public class C14_IterningNew {
    public static void main(String[] args) {
        String a = "xyz";
        String b = "xyz"; // here both a , b point to same "xyz" not different
        String c = new String("xyz"); // here c is pointing to different "xyz"

        // == operator: it checks whether both strings refer to the same memory location (reference).
        // It does NOT compare string content; it compares their addresses.
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);

        // to compare String content we use s1.equals(s2)
        System.out.println(a.equals(c));
    }
}
