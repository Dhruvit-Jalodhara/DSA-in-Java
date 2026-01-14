package L11_Strings;

public class C09_Plus {
    public static void main(String[] args) {
        String s = "dhruvit";

        s = s + " jalodhara";
        System.out.println(s );

        s = s + 10;
        System.out.println(s );

        s = s + 'a';
        System.out.println(s );

        System.out.println("Dhruvit "+10+20);
        System.out.println("Dhruvit "+(10+20));
        System.out.println(10+20+" Dhruvit"); // it evaluates from left to right

    }
}
