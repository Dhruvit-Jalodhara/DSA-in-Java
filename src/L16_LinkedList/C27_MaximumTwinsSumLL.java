package L16_LinkedList;

// LeetCode : 2130

public class C27_MaximumTwinsSumLL {

    public int pairSum(Node head) {
        Node slow = head , fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        Node curr = slow;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node head2 = prev;   // head of reversed second half

        Node temp1 = head , temp2 = head2;
        int maxSum = 0;

        while(temp1 != null && temp2 != null){
            int sum = temp1.value + temp2.value;
            if(sum > maxSum)
                maxSum = sum;

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return maxSum;
    }
}
