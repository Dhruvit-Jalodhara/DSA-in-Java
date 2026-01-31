package L16_LinkedList;

public class C17_RemoveDuplicate2 {

    public Node deleteDuplicates(Node head) {
        if(head == null || head.next == null)
            return head;

        // Dummy node to build result list safely
        Node dummy = new Node(-1);

        Node temp = dummy;   // tail of result list
        Node i = head;       // iterator over original list

        while(i != null){

            // Case 1: current node is unique
            if(i.next == null || i.value != i.next.value){
                temp.next = i;   // attach to result
                temp = i;        // move tail
                i = i.next;      // move forward
            }

            // Case 2: duplicates found → skip all
            else{
                Node j = i.next;

                // move j until value changes
                while(j != null && i.value == j.value){
                    j = j.next;
                }

                i = j;  // jump over all duplicates
            }
        }

        temp.next = i;  // terminate list

        return dummy.next;
    }
}
