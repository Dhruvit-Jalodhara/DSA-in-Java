package L16_LinkedList;

// LeetCode : 92 (Reverse linked list 2)

import java.util.ArrayList;

public class C28_ReverseLinkedList2 {

    // Method 1 : by using arraylist
//    public Node reverseBetween(Node head, int left, int right) {
//        if(head == null || head.next == null)
//            return head;
//
//        ArrayList<Node> arr = new ArrayList<>();
//        Node temp = head;
//        while(temp != null){
//            arr.add(temp);
//            temp = temp.next;
//        }
//
//        int i = left - 1 , j = right - 1;
//        while(i <= j){
//            Node x = arr.get(i);
//            arr.set(i,arr.get(j));
//            arr.set(j,x);
//            i++;
//            j--;
//        }
//
//        for (int k = 0; k < arr.size() - 1; k++) {
//            arr.get(k).next = arr.get(k+1);
//        }
//        arr.get(arr.size() - 1).next = null;
//
//        head = arr.get(0);
//
//        return head;
//    }

    // Method 2 : by using 3 pointer
    public Node reverseBetween(Node head, int left, int right) {
        if(head == null || left == right)
            return head;

        Node dummy = new Node(-1);
        dummy.next = head;

        Node prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        Node curr = prev.next;
        for (int i = 1; i <= right - left; i++){
            Node next = curr.next;

            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }

    // Method 3 :
}
