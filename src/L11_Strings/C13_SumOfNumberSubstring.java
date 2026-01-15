package L11_Strings;

public class C13_SumOfNumberSubstring {
    public static int sumSubstrings(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i,j);
                int temp = Integer.parseInt(sub);
                sum = sum + temp;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "123";
        System.out.println(sumSubstrings(s));
    }
}
