package L18_Queues;

import java.util.Queue;

class QueueLL{
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
            this.next = null;
        }
    }
    private Node front; // remove at front
    private Node rear; // add at rear
    private int size;
    QueueLL(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void add(int value){
        Node newNode = new Node(value);

        if (rear == null) {        // queue is empty
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;   // normal case
            rear = newNode;
        }

        size++;
    }

    public int remove(){
        if (front == null)
            return -1;

        int x = front.value;
        front = front.next;
        size--;

        if (front == null) {   // queue became empty
            rear = null;
        }
        return x;
    }

    public int peek(){
        if(front == null)
            return -1;
        return front.value;
    }

    public void display(){
        Node temp = front;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class C7_CustomQueueViaLinkedList {
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.display();
    }
}
