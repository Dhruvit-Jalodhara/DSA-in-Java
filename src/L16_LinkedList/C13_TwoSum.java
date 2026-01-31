package L16_LinkedList;

// LeetCode no : 2

public class C13_TwoSum {
    public Node addTwoNumbers(Node l1, Node l2) {
        Node head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.value;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.value;
                l2 = l2.next;
            }

            carry = sum / 10;
            int digit = sum % 10;

            Node newNode = new Node(digit);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

}
