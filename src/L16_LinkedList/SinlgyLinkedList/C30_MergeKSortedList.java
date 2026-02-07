package L16_LinkedList.SinlgyLinkedList;

public class C30_MergeKSortedList {

    // method 1 :
//    public Node mergeKLists(Node[] lists) {
//        if (lists == null || lists.length == 0) return null;
//
//        Node result = null;
//
//        for (Node list : lists) {
//            result = mergeTwo(result, list);
//        }
//
//        return result;
//    }
//    public Node mergeTwo(Node temp1, Node temp2) {
//        Node dummy = new Node(-1);
//        Node temp = dummy;
//
//        while (temp1 != null && temp2 != null) {
//            if (temp1.value <= temp2.value) {
//                temp.next = temp1;
//                temp1 = temp1.next;
//            } else {
//                temp.next = temp2;
//                temp2 = temp2.next;
//            }
//            temp = temp.next;
//        }
//
//        if(temp1!=null){
//            temp.next = temp1;
//        }else {
//            temp.next = temp2;
//        }
//        return dummy.next;
//    }

    // method 2 :
    public Node mergeKLists(Node[] lists) {
        if (lists == null || lists.length == 0) return null;
        return merge(lists)[0];
    }

    // recursive method
    public Node[] merge(Node[] lists) {
        if (lists.length == 1)
            return lists;

        int newSize = (lists.length + 1) / 2;
        Node[] ans = new Node[newSize];
        int idx = 0;
        for (int i = 0; i < lists.length; i += 2) {
            if (i + 1 < lists.length)
                ans[idx++] = mergeTwo(lists[i], lists[i + 1]);
            else
                ans[idx++] = lists[i];
        }

        return merge(ans);
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
