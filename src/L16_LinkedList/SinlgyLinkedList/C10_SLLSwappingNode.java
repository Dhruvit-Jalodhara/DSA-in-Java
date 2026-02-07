package L16_LinkedList.SinlgyLinkedList;

// You are given the head of a linked list, and an integer k.
// Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

public class C10_SLLSwappingNode {
    public Node swapNodes(Node head, int k) {

        Node slow = head;
        Node fast = head;

        // Move fast k-1 steps to reach kth node
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }

        Node kthFirst = fast; // kth node from start

        // Move fast to end to find kth from last
        fast = fast.next;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        Node kthLast = slow; // kth node from end

        // Swap values
        int temp = kthFirst.value;
        kthFirst.value = kthLast.value;
        kthLast.value = temp;

        return head;
    }

}
