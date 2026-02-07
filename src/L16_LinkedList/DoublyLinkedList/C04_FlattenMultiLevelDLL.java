package L16_LinkedList.DoublyLinkedList;

// leetcode : 430

class Node2 {
    public int val;
    public Node2 prev;
    public Node2 next;
    public Node2 child;
}

public class C04_FlattenMultiLevelDLL {

    // method 1 :
    public Node2 flatten(Node2 head) {
        if (head == null)
            return head;

        Node2 dummy = new Node2();
        helper(dummy, head);

        dummy.next.prev = null;
        return dummy.next;
    }
    private Node2 helper(Node2 temp, Node2 head) {
        Node2 temp1 = head;
        while (temp1 != null) {
            // attach current node
            temp.next = temp1;
            temp1.prev = temp;
            temp = temp1;

            // store next node
            Node2 next = temp1.next;

            // if child exists → flatten it first
            if (temp1.child != null) {
                temp = helper(temp, temp1.child);
                temp1.child = null;
            }
            temp1 = next;
        }
        return temp; // return tail
    }

    // method 2 :
//    public Node2 flatten(Node2 head) {
//        if (head == null)
//            return head;
//
//        Node2 curr = head;
//        while(curr != null){
//            if(curr.child == null){
//                curr = curr.next;
//            }else{
//                Node2 forward = curr.next;
//                Node2 c = flatten(curr.child);
//                curr.child = null;
//                curr.next = c;
//                c.prev = curr;
//
//                Node2 temp = c;
//                while(temp.next != null) temp = temp.next;
//                temp.next = forward;
//                if(forward != null) forward.prev = temp;
//                curr = forward;
//            }
//        }
//        return head;
//    }
}
