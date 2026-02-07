package L16_LinkedList.SinlgyLinkedList;

public class C09_LeetCode19 {
    public Node removeNthFromEnd(Node head, int n) {

        // If list has only one node
        if (head.next == null) return null;

        Node slow = head;
        Node fast = head;

        // Move fast pointer n steps ahead
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        // If fast is null, remove head
        if (fast == null)
            return head.next;

        // Move both pointers until fast reaches last node means slow is one node before kth from end
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}
