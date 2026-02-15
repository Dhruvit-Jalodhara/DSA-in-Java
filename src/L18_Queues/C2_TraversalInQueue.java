package L18_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class C2_TraversalInQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); // front
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60); // rear
        traverse(q);
    }
    private static void traverse(Queue<Integer> q){
        for (int i = 1; i <= q.size(); i++) {
            int x = q.remove();
            System.out.print(x + " ");
            q.add(x);
        }
        System.out.println();
    }
}
