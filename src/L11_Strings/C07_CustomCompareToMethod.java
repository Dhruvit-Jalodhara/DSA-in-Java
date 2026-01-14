package L11_Strings;

public class C07_CustomCompareToMethod {

    public static int compareTo(String a, String b) {
        int i = 0;

        while (i < a.length() && i < b.length()) {
            int diff = a.charAt(i) - b.charAt(i);
            if (diff != 0) {
                return diff;
            }
            i++;
        }

        // If all matched till now, shorter string comes first
        return a.length() - b.length();
    }

    public static void main(String[] args) {
        String s1 = "dhruvit";
        String s2 = "mkaniuyf";

        System.out.println(compareTo(s1, s2));
    }
}
