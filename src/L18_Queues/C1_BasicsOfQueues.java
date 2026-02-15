package L18_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class C1_BasicsOfQueues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); // front
        q.add(20);
        q.add(30); // rear
        System.out.println(q);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q);
        System.out.println(q.size());

    }
}
