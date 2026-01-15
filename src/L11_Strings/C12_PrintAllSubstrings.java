package L11_Strings;

public class C12_PrintAllSubstrings {
    public static void printSubstrings(String s){
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.print(s.substring(i,j) + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String s = "dhruvit";
        printSubstrings(s);
    }
}
