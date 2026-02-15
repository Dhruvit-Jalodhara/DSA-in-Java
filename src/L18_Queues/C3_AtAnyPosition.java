package L18_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class C3_AtAnyPosition {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); // front
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60); // rear
        traverse(q);
        addAtIndex(q,70,3);
        traverse(q);
        peekAtIndex(q,3);
        deleteAtIndex(q,3);
        traverse(q);
    }

    // 0-based indexing
    private static void addAtIndex(Queue<Integer> q ,int value ,int index){
        int n = q.size();

        for(int i = 0; i < index; i++)
            q.add(q.remove());

        q.add(value);

        for(int i = 0; i < n - index; i++)
            q.add(q.remove());

    }

    // 0-based indexing
    private static void deleteAtIndex(Queue<Integer> q ,int index){
        int n = q.size();

        for(int i = 0; i < index; i++)
            q.add(q.remove());

        q.remove();

        for(int i = 0; i < n - index - 1; i++)
            q.add(q.remove());

    }

    // 0-based indexing
    private static void peekAtIndex(Queue<Integer> q ,int index){
        int n = q.size();

        for(int i = 0; i < index; i++)
            q.add(q.remove());

        System.out.println(q.peek());

        for(int i = 0; i < n - index; i++)
            q.add(q.remove());

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
