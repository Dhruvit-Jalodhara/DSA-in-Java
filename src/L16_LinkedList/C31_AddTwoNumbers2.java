package L16_LinkedList;

public class C31_AddTwoNumbers2 {
    public Node addTwoNumbers(Node l1, Node l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);

        Node head = null , tail = null;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;

            if(l1 != null){
                sum += l1.value;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.value;
                l2 = l2.next;
            }

            int digit = sum % 10;
            carry = sum/10;

            Node newNode = new Node(digit);
            if(head ==  null){
                head = tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }

        head = reverse(head);
        return head;
    }
    public Node reverse(Node head){
        Node prev = null , curr = head;
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
