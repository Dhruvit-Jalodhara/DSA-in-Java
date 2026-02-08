package L16_LinkedList.SinlgyLinkedList;

public class C39_ReverseNodesInKGroups {

    public Node reverseKGroup(Node head, int k) {
        Node dummy = new Node(-1);   // Dummy node
        dummy.next = head;

        Node temp = dummy;          // Before current group
        while (length(temp.next) >= k) {
            Node prev = temp;
            Node curr = temp.next;

            // Reverse k nodes
            for (int i = 1; i <= k; i++) {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node groupTail = temp.next; // Tail after reversal
            temp.next.next = curr;  // Connect remaining list
            temp.next = prev;       // Connect reversed group
            temp = groupTail;       // Move to next group
        }
        head = dummy.next;
        return head;          // New head
    }

    public int length(Node head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
