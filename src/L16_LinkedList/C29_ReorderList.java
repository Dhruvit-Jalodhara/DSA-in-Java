package L16_LinkedList;

// LeetCode : 143

public class C29_ReorderList {
    public void reorderList(Node head) {

        // step 1 : find middle and divide it from here
        Node slow = head , fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse the middle part
        Node curr = slow.next;
        slow.next = null;
        Node prev = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node head2 = prev;

        // merge element of both list one by one
        Node first = head;
        Node second = head2;
        while(second != null){
            Node temp1 = first.next;
            Node temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }

    }
}
