package L16_LinkedList;

// LeetCode 328 : Odd Even Linked List

public class C24_OddEvenIndexLL {

    public Node oddEvenList(Node head) {

        Node dummy1 = new Node(-1); // head for odd list
        Node temp1 = dummy1;       // tail pointer for odd list

        Node dummy2 = new Node(-1); // head for even list
        Node temp2 = dummy2;       // tail pointer for even list


        Node temp = head;   // traverse original list
        int index = 1;      // 1-based indexing (IMPORTANT)

        while(temp != null){

            // If index is odd → add to odd list
            if(index % 2 != 0){
                temp1.next = temp;
                temp1 = temp1.next;
            }

            // If index is even → add to even list
            else{
                temp2.next = temp;
                temp2 = temp2.next;
            }

            // move to next node
            temp = temp.next;
            index++;
        }

        temp1.next = dummy2.next;  // odd → even
        temp2.next = null;

        head = dummy1.next;

        return head;
    }
}
