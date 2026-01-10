package L09_2DArays;

import java.util.ArrayList;

public class C14_2DArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(4);
        a.add(8);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(34);
        b.add(14);
        b.add(46);
        b.add(74);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(2);
        c.add(3);
        c.add(5);
        c.add(7);
        c.add(9);
        c.add(11);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(new ArrayList<>());

        System.out.println(arr);

        for(ArrayList<Integer> list : arr){
            for(int ele : list)
                System.out.print(ele + " ");

            System.out.println();
        }
    }
}
