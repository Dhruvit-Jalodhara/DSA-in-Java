package L16_LinkedList;

// LeetCode : 21

public class C20_MergeSortedLinkedList {
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
