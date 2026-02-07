package L16_LinkedList.SinlgyLinkedList;

public class C21_MergeSortLinkedList {
    public Node sortList(Node head1) {
        Node slow = head1 , fast = head1;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        sortList(head1);
        sortList(head2);

        return mergeTwoLists(head1,head2);
    }
    public Node mergeTwoLists(Node list1, Node list2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        Node temp1 = list1;
        Node temp2 = list2;

        while(temp1 != null && temp2 != null){
            if(temp1.value <= temp2.value){
                temp.next = temp1;
                temp1= temp1.next;
            }else{
                temp.next = temp2;
                temp2= temp2.next;
            }
            temp = temp.next;
        }

        if(temp1!=null){
            temp.next = temp1;
        }else{
            temp.next = temp2;
        }

        return dummy.next;
    }
}
