package L16_LinkedList;

// LeetCode No : 24

public class C14_SwapNodeInPair {
    public Node swapPairs(Node head) {
        if(head == null || head.next == null)
            return head;

        Node first = head;

        while(first!= null && first.next != null){
            int temp = first.value;
            first.value = first.next.value;
            first.next.value = temp;

            first = first.next.next;
        }

        return head;
    }
}
