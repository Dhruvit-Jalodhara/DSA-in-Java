package L16_LinkedList.SinlgyLinkedList;

public class C35_DeleteInCLL {
    public Node deleteNode(Node head, int key) {
        if(head.next == head && head.value == key)
            return null;

        Node tail = head;
        while(tail.next != head)
            tail = tail.next;
        tail.next = null;

        if(head.value == key){
            head = head.next;
            tail.next = head;
            return head;
        }

        Node temp1 = head , temp2 = head.next;
        while(temp2 != null){
            if(temp2.value == key){
                temp1.next = temp2.next;
                break;
            } else {
                temp1 = temp2;
                temp2 = temp2.next;
            }
        }
        tail.next = head;
        return head;
    }
}
