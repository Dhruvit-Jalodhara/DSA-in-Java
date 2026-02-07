package L16_LinkedList.SinlgyLinkedList;

public class C03_GetElementByIndex {


    // 0-based indexing
    public static int get(Node head , int n){
        if(n < 0 || head == null){
            return -1;
        }

//        int index = 0;
//        Node temp = head;
//
//        while(temp != null){
//            if(index == n)
//                return temp.value;
//
//            temp = temp.next;
//            index++;
//        }

        Node temp = head;
        for (int i = 0; i < n; i++) {
            temp = temp.next;
        }
        if(temp != null) return temp.value;
        return -1;
    }

    public static void main(String[] args) {
        Node a = new Node(10); // head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(get(a,4));
    }
}
