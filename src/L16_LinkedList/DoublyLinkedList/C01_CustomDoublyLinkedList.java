package L16_LinkedList.DoublyLinkedList;


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

    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;

        if(head != null)
            head.prev = newNode;

        head = newNode;

        if(tail == null)
            tail = newNode;

        size++;
    }

    public void insert(int index , int value){
        if(index < 0 || index > size) return;
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next.prev = newNode;

        temp.next = newNode;
        newNode.prev = temp;

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

    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty !");
            return;
        }
        head = head.next;
        if(head != null){
            head.prev = null;
        }else{
            tail = null;    // list become empty
        }
        size--;
    }

    public void delete(int index){
        if(index < 0 || index > size - 1) return;

        if(index == 0){
            deleteFirst();
            return;
        }

        if(index == size - 1){
            deleteLast();
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        temp.next.prev = temp;

        size--;
    }

    public void deleteLast(){
        if(tail == null){
            System.out.println("list is empty !");
            return;
        }
        tail = tail.prev;
        if(tail != null){
            tail.next = null;
        }else{
            head = null;    // list become empty
        }
        size--;
    }

    public void reverse() {
        if (head == null || head.next == null)
            return;

        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        // swap head and tail
        Node temp = head;
        head = prev;
        tail = temp;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayReverse(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.prev;
        }
        System.out.println("null");
    }

}



public class C01_CustomDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);
        list.insertLast(40);
        list.insertLast(50);
        list.insertLast(60);

        list.display();

        list.deleteFirst();
        list.deleteLast();

        list.display();

        list.insert(0, 30);
        list.insert(4, 60);

        list.display();

        list.delete(2);
        list.delete(5);

        list.display();

    }
}
