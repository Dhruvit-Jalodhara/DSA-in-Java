package L11_Strings;

// Given a string s, the task is to change the complete string to uppercase or lowercase depending on the case of the first character.

public class C08 {
    public static String modify(String s) {
        if(s.charAt(0) >= 65 && s.charAt(0)<= 90)
            return s.toUpperCase();
        else
            return s.toLowerCase();
    }
    public static void main(String[] args) {

    }
}
