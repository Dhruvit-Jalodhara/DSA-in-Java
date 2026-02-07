package L16_LinkedList.SinlgyLinkedList;

public class C07_SLLDeleteMiddle {
    public Node deleteMiddle(Node head) {
        if (head == null || head.next == null)
            return null;

        Node prev = null;      // Node before slow
        Node slow = head;      // Moves 1 step
        Node fast = head;      // Moves 2 steps

        // Find middle using fast & slow pointers
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // here middle = slow , Remove the middle node
        prev.next = slow.next;

        return head;
    }

}
