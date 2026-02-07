package L16_LinkedList.SinlgyLinkedList;

//class Node {
//    int value;
//    Node next; // default value = null
//
//    Node(int value){
//        this.value = value;
//    }
//}

public class C02_DisplayList {

    // to print
    public static void dispalyRecursive(Node head){
        if(head == null){
            System.out.println("null");
            return;
        }

        System.out.print(head.value + " -> ");
        dispalyRecursive(head.next);
    }

    // to print in reverse
    public static void dispalyReverse(Node head){
        if(head == null){
            System.out.print("null");
            return;
        }

        dispalyReverse(head.next);
        System.out.print(" -> " + head.value);
    }

    public static void display(Node head){
        if(head == null){
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
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
        display(a);
        dispalyRecursive(a);
        dispalyReverse(a);
    }

}
