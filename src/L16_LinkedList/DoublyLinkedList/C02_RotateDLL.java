package L16_LinkedList.DoublyLinkedList;

public class C02_RotateDLL {
    public Node rotateDLL(Node head, int k) {
        if (head == null || head.next == null)
            return head;

        int size = 1;
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
            size++;
        }

        k = k % size;
        if (k == 0)
            return head;

        // make circular
        tail.next = head;
        head.prev = tail;

        // move to kth node
        Node curr = head;
        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }

        // break circularity
        head = curr.next;
        curr.next = null;
        head.prev = null;

        return head;
    }

}
