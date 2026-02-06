package L16_LinkedList;

// Split a Linked List into 2 halves

public class C34_SplitCircularListInTwo {
    public Node[] split(Node head){

        // Edge case: empty or single node
        if (head == null || head.next == head)
            return new Node[]{head, null};

        Node slow = head;
        Node fast = head;

        // Find middle using slow & fast pointers
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // For even number of nodes
        if (fast.next.next == head)
            fast = fast.next;

        // Set heads of two halves
        Node head1 = head;
        Node head2 = slow.next;

        // Make both halves circular
        slow.next = head1;
        fast.next = head2;

        return new Node[]{head1, head2};
    }
}
