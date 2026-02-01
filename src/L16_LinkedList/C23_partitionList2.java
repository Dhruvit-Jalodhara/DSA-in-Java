package L16_LinkedList;

// GFG Practice : Partition a Linked List around a given value

public class C23_partitionList2 {

    public static Node partition(Node head, int x) {

        Node dummy1 = new Node(-1);   // list for < x
        Node temp1 = dummy1;         // tail pointer for < x list

        Node dummy2 = new Node(-1);   // list for = x
        Node temp2 = dummy2;         // tail pointer for = x list

        Node dummy3 = new Node(-1);   // list for > x
        Node temp3 = dummy3;         // tail pointer for > x list

        Node temp = head;       // Traverse original list

        while(temp != null){

            // Case 1: value < x → add to first list
            if(temp.value < x){
                temp1.next = temp;    // attach node
                temp1 = temp1.next;  // move tail
            }

            // Case 2: value > x → add to third list
            else if(temp.value > x){
                temp3.next = temp;
                temp3 = temp3.next;
            }

            // Case 3: value == x → add to second list
            else{
                temp2.next = temp;
                temp2 = temp2.next;
            }

            temp = temp.next;       // move forward in original list
        }

        // Now connect the 3 lists together
        temp1.next = dummy2.next;
        temp2.next = dummy3.next;
        temp3.next = null;

        head = dummy1.next;     // new head is first real node after dummy1

        return head;
    }
}
