package L06_Arrays;

import java.util.Collections;
import java.util.Vector;

public class C20_AddingOne {
//    public static Vector<Integer> addOne(int[] arr) {
//        Vector<Integer> vec = new Vector<>();
//        int n = arr.length;
//        arr[n-1] += 1;
//        for (int i = n-1; i >= 1; i--) {
//            if(arr[i] == 10){
//                vec.add(0);
//                arr[i-1] += 1;
//            }else{
//                vec.add(arr[i]);
//            }
//        }
//        if(arr[0] == 10){
//            vec.add(0);
//            vec.add(1);
//        }else{
//            vec.add(arr[0]);
//        }
//        Collections.reverse(vec);
//        return vec;
//    }

    // more clear and optimize
    public static Vector<Integer> addOne(int[] arr) {
        Vector<Integer> res = new Vector<>();
        int carry = 1; // because we add 1

        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] + carry <= 9){
                res.add(arr[i] + carry);
                carry = 0;
            }else{ //arr[i] + carry = 10
                res.add(0);
                carry = 1;
            }
        }

        if (carry == 1) {
            res.add(1);
        }

        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,8};

        System.out.println(arr.toString());
        System.out.println(addOne(arr));
    }
}

