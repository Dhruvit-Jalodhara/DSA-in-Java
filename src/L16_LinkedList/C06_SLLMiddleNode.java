package L16_LinkedList;

public class C06_SLLMiddleNode {

    // method 1 : size -> get mid
//    public Node middleNode(Node head) {
//        if (head == null) return null;
//
//        int n = 0;
//        Node temp = head;
//        while (temp != null){
//            n++;
//            temp = temp.next;
//        }
//
//        temp = head;
//        int mid = n/2 + 1;
//        for (int i = 1; i < mid; i++) {
//            temp = temp.next;
//        }
//
//        return temp;
//    }


    // method 2 : slow - fast pointer
    public Node middleNode(Node head) {
        Node slow = head , fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
