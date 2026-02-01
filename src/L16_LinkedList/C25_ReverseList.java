package L16_LinkedList;

public class C25_ReverseList {
//    public static Node reverse(Node head){
//        if(head == null || head.next == null)
//            return head;
//
//        Node prev = null;
//        Node curr = head;
//
//        while(curr != null){
//            Node next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//
//        head = prev;
//
//        return head;
//    }

    // By recursion
    public static Node reverse(Node head){
        if(head == null || head.next == null)
            return head;

        Node a = head.next;
        head.next = null;
        Node newHead = reverse(a);
        a.next = head;

        return newHead;
    }
}
