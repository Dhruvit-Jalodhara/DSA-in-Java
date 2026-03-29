package L16_LinkedList.SinlgyLinkedList;

public class practice {
    public Node kthLast(Node head , int value , int target){
        if(head == null)
            return null;

        Node newNode  = new Node(value);
        Node temp = head;

        while(temp.next != null && temp.next.value != target)
            temp = temp.next;

        if(temp.next == null)
            return head; // target not found

        newNode.next = temp.next;
        temp.next = newNode;

         return head;
    }
}
