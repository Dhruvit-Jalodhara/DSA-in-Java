package L16_LinkedList;

class SinglyLinkedList{

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
            this.next = null;
        }

    }

    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if(tail == null){ // means if SLL is empty then head = tail = First element
            tail = head;
        }
        size++;
    }

    public void inserLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }

        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;

        size++;
    }

    public void deleteFirst(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
        size--;

        if(head == null)
            tail = null;
    }

    public void deleteLast(){
        if(size <= 1) {
            deleteFirst();
            return;
        }

        Node secondLast = head;
        while(secondLast.next != tail){
            secondLast = secondLast.next;
        }

        secondLast.next = null;
        tail = secondLast;
        size--;
    }

    public void display(){
        if(head == null){
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

}

public class C04_CustomSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);
        list.inserLast(40);
        list.inserLast(50);
        list.inserLast(60);

        list.display();

        list.deleteFirst();
        list.deleteLast();

        list.display();
    }
}
