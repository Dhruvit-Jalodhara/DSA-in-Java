package L16_LinkedList.DoublyLinkedList;

public class Node {
    int value;
    public Node next;
    public Node prev;
    Node(int value){
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
