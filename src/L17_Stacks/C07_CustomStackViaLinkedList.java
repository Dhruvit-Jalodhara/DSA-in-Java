package L17_Stacks;

// here we are gonna implements stack using linked list
// here head of linked list as gonna work as top
// top -> head
// push() -> insert at head
// pop() -> delete at head
// peek() -> value of head

class StackLL{
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }
    private Node head;
    private int size;

    public StackLL() {
        this.head = null;
        this.size = 0;
    }

    public void push(int value){
        Node newNode = new Node(value);

        if(size == 0){
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    public int pop() throws Exception{
        if(size == 0){
            throw new Exception("Stack UnderFlow Error!");
        }
        int value = head.value;
        head = head.next;
        size--;
        return value;
    }

    public int peek() throws Exception{
        if(size == 0){
            throw new Exception("Stack UnderFlow Error!");
        }
        return head.value;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size == 0);
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class C07_CustomStackViaLinkedList {
    public static void main(String[] args) throws Exception {
        StackLL st1 = new StackLL();
        // st1.peek();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.display();

        st1.pop();
        st1.display();

        System.out.println(st1.peek());
        System.out.println(st1.isEmpty());
        System.out.println(st1.size());
    }
}
