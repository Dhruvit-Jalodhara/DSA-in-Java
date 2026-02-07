package L16_LinkedList.SinlgyLinkedList;

public class C36_ReverseCLL {
    public Node reverseCircular(Node head) {
        if(head == null || head.next == head)
            return head;

        // step 1 : CLL -> SLL
        Node temp = head;
        while(temp.next != head)
            temp = temp.next;
        temp.next = null;

        // step 2 : reverse SLL
        Node prev = null , curr = head;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Convert SLL back to CLL
        head.next = prev;   // old head becomes tail
        head = prev;        // new head

        return head;
    }
}
