package L16_LinkedList.SinlgyLinkedList;

// leetcode : 142
// Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

public class C15_FirstNodeLinkedListCycle {
    public Node detectCycle(Node head) {
        // Edge case: empty list or single node
        if (head == null || head.next == null) return null;

        Node slow = head, fast = head;

        // Step 1: Detect cycle using slow & fast pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) break;   // cycle detected
        }

        if (slow != fast) return null; // No cycle found

        // Step 2: Find entry point of the cycle
        Node temp = head;
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }

        return temp;    // Cycle starting node
    }
}
