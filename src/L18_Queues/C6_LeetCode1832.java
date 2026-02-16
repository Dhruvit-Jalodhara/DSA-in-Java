package L18_Queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class C6_LeetCode1832 {
    // method 1 : by queue
//    public int findTheWinner(int n, int k) {
//        Queue<Integer> q = new LinkedList<>();
//        for (int i = 1; i <= n; i++) {
//            q.add(i);
//        }
//
//        int count = 1;
//        while(q.size() > 1){
//            if(count == k){
//                q.remove();
//                count = 1;
//            }else{
//                q.add(q.remove());
//                count++;
//            }
//        }
//
//        return q.peek();
//    }

    // method 2 : by ArrayList
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }

        int index = 0;

        while (arr.size() > 1) {
            index = (index + k - 1) % arr.size();
            arr.remove(index);
        }

        return arr.get(0);
    }
}
