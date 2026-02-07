package L16_LinkedList.SinlgyLinkedList;
// LeetCode No : 24

public class C14_SwapNodeInPair {
//    public Node swapPairs(Node head) {
//        if(head == null || head.next == null)
//            return head;
//
//        Node first = head;
//
//        while(first!= null && first.next != null){
//            int temp = first.value;
//            first.value = first.next.value;
//            first.next.value = temp;
//
//            first = first.next.next;
//        }
//
//        return head;
//    }

    public Node swapPairs(Node head) {
        if(head == null || head.next == null)
            return head;

        Node dummy = new Node(-1);
        dummy.next = head;      // Dummy points to original head

        Node a = head;          // a -> first node of pair
        Node b = head.next;     // b -> second node of pair
        Node c = dummy;         // c -> previous node before pair

        while(a != null && b != null){

            c.next = b;         // Step 1: previous -> second
            a.next = b.next;   // Step 2: first -> next pair start
            b.next = a;        // Step 3: second -> first (swap happens here)
            c = a;        // Move previous pointer forward , now 'a' becomes the last node of swapped pair
            a = a.next;       // Move 'a' to next pair
            if(a != null)     // Update 'b' safely
                b = a.next;
        }

        head = dummy.next;

        return head;
    }

}
