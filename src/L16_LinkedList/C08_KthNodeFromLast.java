package L16_LinkedList;

public class C08_KthNodeFromLast {
    // method 1 : kth from end = (n - k + 1)th from start
//    public Node getKthFromLast(Node head, int k) {
//        int n = 0;
//        Node temp = head;
//        while (temp != null) {
//            n++;
//            temp = temp.next;
//        }
//
//        int tar = n - k + 1;
//        if(tar <= 0) return null;
//
//        temp = head;
//        for (int i = 1; i < tar; i++) {
//            temp = temp.next;
//        }
//
//        return temp;
//    }

    // Method 2: 2 pointer approach
    public Node getKthFromLast(Node head, int k) {
        Node slow = head;
        Node fast = head;

        // Move fast pointer k steps ahead
        for (int i = 1; i <= k; i++) {
            if (fast == null) return null; // k > length
            fast = fast.next;
        }

        // Move both pointers until fast reaches end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow; // kth node from end
    }

}
