package L16_LinkedList;

// LeetCode : 61

public class C18_RotateLinkedList {

    public Node rotateRight(Node head, int k) {

        // Edge cases: empty, single node, or no rotation
        if(head == null || head.next == null || k == 0)
            return head;

        int size = 0;
        Node temp = head;

        while(temp.next != null){   // Step 1: find length and last node
            size++;
            temp = temp.next;
        }
        size++; // count last node


        temp.next = head;   // Step 2: make list circular

        k = k % size;   // Step 3: reduce extra rotations

        // Step 4: move to new tail (size - k - 1 steps)
        temp = head;
        int i = 1;
        while(i < size - k){
            temp = temp.next;
            i++;
        }

        // Step 5: break circle and set new head
        head = temp.next;
        temp.next = null;

        return head;
    }


}
