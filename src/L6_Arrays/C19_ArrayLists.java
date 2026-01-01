package L6_Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class C19_ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); // arraylist : dynamic array
        arr.add(10); //  to add element in arraylist
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(60);

        System.out.println(arr.get(1)); // get(index)  : to get the element the of arraylist

        arr.set(2,50); // set(index,new value) : to change the value at any particular index

        System.out.println(arr);

        arr.size(); // give the length or size of arraylist

        arr.remove(1); // remove(index) : delete element at particular index

        System.out.println(arr);

//        Collections.reverse(arr); // it reverses the arraylist

        // code for reverse arraylist
        int i = 0, j = arr.size() -1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }

        System.out.println(arr);
    }
}

