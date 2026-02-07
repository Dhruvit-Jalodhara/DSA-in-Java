package L16_LinkedList.DoublyLinkedList;

public class C03_RemoveDuplicatesDLL {
//    public Node removeDuplicates(Node head) {
//        if(head == null || head.next == null)
//            return head;
//
//        Node temp = head;
//        while(temp.next != null){
//            if(temp.value == temp.next.value){
//                temp.next = temp.next.next;
//                if(temp.next != null){
//                    temp.next.prev = temp;
//                }
//            }else{
//                temp = temp.next;
//            }
//        }
//
//        return head;
//    }

    // method 2 : by sliding window technique
    public Node removeDuplicates(Node head) {
        if(head == null || head.next == null)
            return head;

        Node i = head , j = head.next;
        while(j != null){
            if(i.value == j.value){
                j = j.next;
            }else{
                i.next = j;
                j.prev = i;
                i = j;
            }
        }
        i.next = j;

        return head;
    }
}
