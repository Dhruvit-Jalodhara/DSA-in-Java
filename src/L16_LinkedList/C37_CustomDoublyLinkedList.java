package L16_LinkedList;

class DoublyLinkedList{
    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void inserFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;

        if(head != null)
            head.prev = newNode;

        head = newNode;

        if(tail == null)
            tail = newNode;

        size++;
    }

    public void insertLast(int value){
        Node newNode = new Node(value);
        newNode.prev = tail;
        if(tail != null)
            tail.next = newNode;
        tail = newNode;
        if(head == null)
            head = tail;

        size++;
    }

}



public class C37_CustomDoublyLinkedList {

}
