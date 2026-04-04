package L21_HashMaps_And_HashSets;


import java.util.HashMap;

public class C15_CopyListRandomPointer {
    static class Node{
        int value;
        Node next;
        Node random;
        Node(int value){
            this.value = value;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node a){
        if(a == null) return null;

        HashMap<Node,Node> map = new HashMap<>();  // <a,b>
        map.put(null,null);

        Node b = deepCopy(a);
        Node tempA = a , tempB = b;

        while(tempA != null){
            map.put(tempA,tempB);
            tempA = tempA.next;
            tempB = tempB.next;
        }
        tempA = a;

        while(tempA != null){
            tempB = map.get(tempA);
            tempB.random = map.get(tempA.random);
            tempA = tempA.next;
        }
        return b;
    }

    private Node deepCopy(Node head){

        Node dummy = new Node(-1);
        Node temp1 = head , temp2 = dummy;
        while(temp1 != null){
            Node newNode = new Node(temp1.value);
            temp2.next = newNode;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return dummy.next;
    }
}
