package L16_LinkedList.SinlgyLinkedList;

import java.util.ArrayList;

public class C26_PalindromeList {

    // method 1 :
//    public boolean isPalindrome(Node head) {
//        ArrayList<Integer> list = new ArrayList<>();
//        for (Node temp = head; temp != null; temp = temp.next) {
//            list.add(temp.value);
//        }
//
//        int i = 0 , j = list.size() - 1;
//        while(i <= j){
//            if(list.get(i) != list.get(j))
//                return false;
//
//            i++;
//            j--:
//        }
//        return true;
//    }

    // method 2 : reverse seconf half of linked list and then compare both until any one become null
    public boolean isPalindrome(Node head) {

        Node slow = head , fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverse(slow);       // Reverse second half of the list starting from middle

        // temp1 -> first half
        // temp2 -> reversed second half
        Node temp1 = head , temp2 = slow;

        while(temp1 != null && temp2 != null){
            if(temp1.value != temp2.value)
                return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return true;
    }

    public Node reverse(Node head){
        if(head == null || head.next == null)
            return head;

        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

}
