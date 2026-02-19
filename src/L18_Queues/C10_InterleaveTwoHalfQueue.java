package L18_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class C10_InterleaveTwoHalfQueue {

    public void rearrangeQueue(Queue<Integer> q) {
        int n1 = q.size();
        Queue<Integer> firstHalf = new LinkedList<>();

        for (int i = 0; i < n1/2 ; i++) {
            firstHalf.add(q.remove());
        }
        while(firstHalf.size() > 0){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }
}
