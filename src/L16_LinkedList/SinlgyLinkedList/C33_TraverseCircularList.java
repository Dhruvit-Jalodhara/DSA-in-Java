package L16_LinkedList.SinlgyLinkedList;
public class C33_TraverseCircularList {
    public void display(Node head){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }while(temp != head);
        System.out.println("null");
    }
}
