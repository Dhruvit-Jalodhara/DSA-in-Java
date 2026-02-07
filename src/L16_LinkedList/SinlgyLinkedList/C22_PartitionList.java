package L16_LinkedList.SinlgyLinkedList;

// LeetCode : 86

public class C22_PartitionList {
    public Node partition(Node head, int x) {

        Node dummy1 = new Node(-1); // head of list having value less than x
        Node temp1 = dummy1;

        Node dummy2 = new Node(-1); // head of list having value greater than equal to x
        Node temp2 = dummy2;

        Node temp = head;
        while(temp != null){
            if(temp.value < x){
                temp1.next = temp;
                temp1 = temp1.next;
            }else{
                temp2.next = temp;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        temp1.next = dummy2.next; // tail of head1
        temp2.next = null; // tail of head2

        Node head1 = dummy1.next;
        Node head2 = dummy2.next;

        return head1;
    }
}
