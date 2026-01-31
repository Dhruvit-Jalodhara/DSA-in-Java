package L16_LinkedList;

// Leetcode : 83
// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

public class C16_RemoveDuplicates {


    // Method 1 : by two pointers method
//    public Node deleteDuplicates(Node head) {
//        if(head == null || head.next == null) return head;
//        Node i = head , j = head.next;
//        while(j != null){
//            if(i.value == j.value){
//                j = j.next;
//                i.next = j;
//            }else{
//                i = i.next;
//                j = j.next;
//            }
//        }
//        return head;
//    }

    // Method 2 : by sliding window method
    public Node deleteDuplicates(Node head) {
        if(head == null || head.next == null) return head;
        Node i = head , j = head.next;
        while(j != null){
            if(i.value == j.value){
                j = j.next;
            }else{
                i.next = j;
                i = j;
            }
        }
        i.next = j;
        return head;
    }
}
