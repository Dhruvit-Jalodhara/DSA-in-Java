package L12_Recursion;

public class C25_LookAndSay {
    public static String countAndSay(int n) {
        if(n == 1)
            return "1";

        String str = countAndSay(n-1);
        StringBuilder ans = new StringBuilder();
        int i = 0 , j = 0;
        while(j < str.length()){
            if(str.charAt(i) == str.charAt(j)){
                j++;
            }else {
                ans.append(j-i); // freq = j - i
                ans.append(str.charAt(i));
                i = j;
            }
        }
        ans.append(j-i);
        ans.append(str.charAt(i));
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = countAndSay(6);
        System.out.println(str);
    }

}
