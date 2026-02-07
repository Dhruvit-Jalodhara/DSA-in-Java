package L16_LinkedList.SinlgyLinkedList;

class Node2 {
    int val;
    Node2 next;
    Node random;

    public Node2(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class C38_LeetCode138 {

    public Node2 copyRandomList(Node2 head1) {
        if(head1 == null) return null;

        // step 1 : creating deep copy without random connecting
        Node2 head2 = deepCopy(head1);

        // step 2 : alternatively connecting the list
        merge(head1 , head2);

        // step 3 : connecting random connection
        randomConnections(head1 , head2);

        // step 4 : split lists
        split(head1 , head2);

        return head2;
    }

    public Node2 deepCopy(Node2 head){
        Node2 dummy = new Node2(-1);
        Node2 temp1 = head;
        Node2 temp2 = dummy;
        while(temp1 != null){
            Node2 newNode = new Node2(temp1.val);
            temp2.next = newNode;
            temp2 = newNode;
            temp1 = temp1.next;
        }
        return dummy.next;
    }

    public void merge(Node2 head1 , Node2 head2){
        Node2 dummy = new Node2(-1);
        Node2 temp = dummy;
        Node2 temp1 = head1;
        Node2 temp2 = head2;

        while(temp2 != null){
            temp.next =temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next =temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
    }

    public void randomConnections(Node2 head1 ,Node2 head2){
        Node2 temp1 = head1;
        Node2 temp2 = head2;

        while(temp1 != null){
            if(temp1.random == null) temp2.random = null;
            else temp2.random = temp1.random.next;

            temp1 = temp1.next.next;
            if(temp2.next != null)temp2 = temp2.next.next;
        }
    }

    public void split(Node2 head1 , Node2 head2){
        Node2 dummy1 = new Node2(-1);
        Node2 temp1 = dummy1;
        Node2 dummy2 = new Node2(-1);
        Node2 temp2 = dummy2;

        Node2 temp = head1;
        while(temp != null){
            temp1.next = temp;
            temp = temp.next;
            temp1 = temp1.next;

            temp2.next = temp;
            temp = temp.next;
            temp2 = temp2.next;
        }
        temp1.next = null;
        temp2.next = null;

        head1 = dummy1.next;
        head2 = dummy2.next;
    }
}
