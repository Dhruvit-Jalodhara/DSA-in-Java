package L11_Strings;

//StringBuilders is a like variable String which can is mutable

public class C15_StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Dhruvit");
        System.out.println(sb);

        sb.append(" Jalodhara");
        System.out.println(sb);

        sb.setCharAt(4,'m');
        System.out.println(sb);

        // StringBuilders -> String
        String s = sb.toString();
        System.out.println(s);

        // To Reverse StringBuilders
        sb.reverse();
        System.out.println(sb);

        //To delete char in StringBuilders
        sb.reverse();

        sb.deleteCharAt(4);
        System.out.println(sb);

        // To Inser char
        sb.insert(4,'v');
        System.out.println(sb);

        //to delete substring
        sb.delete(5,sb.length()); // here last index is excluded
        System.out.println(sb);

        // to reverse the string
        String s1 = new String("Dhruvit");
        StringBuilder sb1 = new StringBuilder(s1);
        s1 = sb1.reverse().toString(); //
        System.out.println(s1);



    }
}
