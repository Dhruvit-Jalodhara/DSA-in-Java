package L16_LinkedList;

public class C30_MergeKSortedList {
    public Node mergeKLists(Node[] lists) {
        if (lists == null || lists.length == 0) return null;

        Node result = null;

        for (Node list : lists) {
            result = mergeTwo(result, list);
        }

        return result;
    }
    public Node mergeTwo(Node temp1, Node temp2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (temp1 != null && temp2 != null) {
            if (temp1.value <= temp2.value) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }

        if(temp1!=null){
            temp.next = temp1;
        }else {
            temp.next = temp2;
        }
        return dummy.next;
    }
}
