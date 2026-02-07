package L16_LinkedList.SinlgyLinkedList;

// LeetCode : 92 (Reverse linked list 2)

import java.util.ArrayList;

public class C28_ReverseLinkedList2 {

    // Method 1 : by using arraylist
//    public Node reverseBetween(Node head, int left, int right) {
//        if(head == null || head.next == null)
//            return head;
//
//        ArrayList<Node> arr = new ArrayList<>();
//        Node temp = head;
//        while(temp != null){
//            arr.add(temp);
//            temp = temp.next;
//        }
//
//        int i = left - 1 , j = right - 1;
//        while(i <= j){
//            Node x = arr.get(i);
//            arr.set(i,arr.get(j));
//            arr.set(j,x);
//            i++;
//            j--;
//        }
//
//        for (int k = 0; k < arr.size() - 1; k++) {
//            arr.get(k).next = (i == arr.size() - 1) ? null : arr.get(k+1);
//        }
//        head = arr.get(0);
//
//        return head;
//    }

    // Method 2 : by using 3 pointer
    public Node reverseBetween(Node head, int left, int right) {
        if(head == null || left == right)
            return head;

        Node dummy = new Node(-1);
        dummy.next = head;

        Node beforeStart = dummy;
        for (int i = 1; i < left; i++) {
            beforeStart = beforeStart.next;
        }

        Node prev = beforeStart.next;
        Node curr = prev.next;
        for (int i = 1; i <= right - left; i++){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        beforeStart.next.next = curr;
        beforeStart.next = prev;

        return dummy.next;
    }

    // Method 3 : divide list in 3 parts  reverse middle part and again joining the 3 parts
//    public Node reverseBetween(Node head, int left, int right){
//
//        // If list is empty or no reversal needed
//        if(head == null || left == right)
//            return head;
//
//        // Dummy node to handle edge case when left = 1 and make list 0 indexed
//        Node dummy = new Node(-1);
//        dummy.next = head;
//
//        // Find tail of part 1 (node before 'left')
//        Node temp = dummy;
//        for (int i = 1; i < left; i++) {
//            temp = temp.next;
//        }
//        Node tail1 = temp;
//
//        // Head of part 2 (sublist to be reversed)
//        Node head2 = tail1.next;
//        tail1.next = null;   // Separate part 1 and part 2
//
//        // Find tail of part 2 (node at 'right')
//        temp = head2;
//        for (int i = 1; i <= right - left; i++) {
//            temp = temp.next;
//        }
//
//        // Head of part 3 (nodes after 'right')
//        Node head3 = temp.next;
//        temp.next = null;    // Separate part 2 and part 3
//
//        // Reverse the middle part (part 2)
//        Node prev = null;
//        Node curr = head2;
//        while(curr != null){
//            Node next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//
//        // Connect part 1 with reversed part 2
//        tail1.next = prev;  // after reverse prev = newHead of part 2
//
//        // Connect reversed part 2 with part 3
//        head2.next = head3; // after reverse head2 = newTail of part 2
//
//        // Return updated head
//        return dummy.next;
//    }
}
