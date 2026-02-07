package L16_LinkedList.SinlgyLinkedList;

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

    public void insert(int value , int index){
        if(index < 0 || index > size) {
            System.out.println("Index out of Bound");
            return;
        }

        if(index == 0){
            insertFirst(value);
            return;
        }

        if(index == size){
            inserLast(value);
            return;
        }

        Node newNode = new Node(value);
        Node temp = head;

        // move to (index - 1)
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
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

    // 0-based index
    public void delete(int index){
        if (index < 0 || index >= size) {
            return;
        }

        // delete head
        if (index == 0) {
            deleteFirst();
            return;
        }

        if (index == size - 1) {
            deleteLast();
            return;
        }

        Node temp = head;
        // move to (index - 1)th node
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
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

    public int getValue(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.value;
    }

    public int length(){
        return size;
    }

    // Search for value if exists return index else -1
    public int search(int value){

        if(head == null) return  -1;

        Node temp = head;
        int index = 0;

        while(temp != null){
            if(temp.value == value)
                return index;

            temp = temp.next;
            index++;
        }

        return -1;
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

        list.insert(10,0);
        list.insert(70,4);

        list.display();

        list.delete(2);
        list.delete(5);

        list.display();

        System.out.println(list.getValue(2));
        System.out.println(list.length());
        System.out.println(list.search(30));
        System.out.println(list.search(50));
    }
}














