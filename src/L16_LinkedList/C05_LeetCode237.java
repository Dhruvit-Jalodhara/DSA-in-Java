package L16_LinkedList;



public class C05_LeetCode237 {
    public void deleteNode(Node node) {
        node.value = node.next.value;
        node.next = node.next.next;
    }
}
