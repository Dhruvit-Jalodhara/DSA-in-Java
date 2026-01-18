package L12_Recursion;

import java.util.ArrayList;

public class C18_StringAndStringbuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String[] arr = {"ab" , "cd" , "ef" , "gh"};
        change(arr);

        // Arraylist of string is passed by reference
        ArrayList<String> al = new ArrayList<>();
        al.add("ab");
        al.add("cd");
        al.add("ef");
        al.add("gh");
        System.out.println(al);
        change2(al);
        System.out.println(al);
    }

    private static void change2(ArrayList<String> al) {
        al.add("ij");
    }

    private static void change(String[] arr) {
        arr[0] = "ijk";
    }
}
