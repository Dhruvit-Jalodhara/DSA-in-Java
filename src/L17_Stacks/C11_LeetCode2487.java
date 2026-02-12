package L17_Stacks;

import L16_LinkedList.SinlgyLinkedList.Node;

import java.util.Stack;

public class C11_LeetCode2487 {

    // method 1 : by stack
    public Node removeNodes(Node head) {
        Stack<Node> st = new Stack<>();
        Node temp = head;
        while(temp != null){
            while(st.size() > 0 && st.peek().value < temp.value)
                st.pop();

            st.push(temp);
            temp = temp.next;
        }

        temp = null;
        while(st.size() > 0){
            Node newNode = st.pop();
            newNode.next = temp;
            temp = newNode;
        }
        head = temp;

        return head;
    }

    // method 2 : by Linked List
//    public Node removeNodes(Node head) {
//        head = reverse(head);
//        Node dummy = new Node(-1);
//        Node temp1 = dummy , temp = head;
//        while(temp != null){
//            if(temp1.value <= temp.value){
//                temp1.next = temp;
//                temp1 = temp1.next;
//            }
//            temp = temp.next;
//        }
//        temp1.next = temp;
//        head = reverse(dummy.next);
//
//        return head;
//    }
//
//    public Node reverse(Node head){
//        Node prev = null , curr = head;
//        while(curr != null){
//            Node next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        head = prev;
//        return head;
//    }
}
