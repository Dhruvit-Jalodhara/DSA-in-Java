package L16_LinkedList.SinlgyLinkedList;

public class C37_LeetCode2058 {
//    public int[] nodesBetweenCriticalPoints(Node head) {
//        if (head == null || head.next == null || head.next.next == null)
//            return new int[]{-1, -1};
//
//        ArrayList<Integer> point = new ArrayList<>();
//
//        Node prev = head;
//        Node curr = head.next;
//        int index = 1;   // curr index
//
//        while (curr.next != null) {
//            Node next = curr.next;
//
//            if (prev.value < curr.value && curr.value > next.value)
//                point.add(index);
//            else if(prev.value > curr.value && curr.value < next.value)
//                point.add(index);
//
//            prev = curr;
//            curr = next;
//            index++;
//        }
//
//        if (point.size() < 2)
//            return new int[]{-1, -1};
//
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < point.size() - 1; i++) {
//            min = Math.min(min, point.get(i + 1) - point.get(i));
//        }
//
//        int max = point.get(point.size() - 1) - point.get(0);
//
//        return new int[]{min, max};
//    }

    public int[] nodesBetweenCriticalPoints(Node head) {
        // less than 3 nodes → no critical points
        if (head == null || head.next == null || head.next.next == null)
            return new int[]{-1, -1};

        int firstIdx = -1, listIdx = -1;   // first & previous critical indices
        int minDist = Integer.MAX_VALUE;    // minimum distance

        int index = 1;                  // index of curr node
        Node prev = head;
        Node curr = head.next;

        while (curr.next != null) {
            Node next = curr.next;

            // check if curr is a critical point
            if ((prev.value < curr.value && curr.value > next.value) ||
                    (prev.value > curr.value && curr.value < next.value)) {
                if (firstIdx == -1) {
                    firstIdx = index;      // first critical point
                }
                if(listIdx != -1){
                    int dis = index - listIdx;
                    minDist = Math.min(minDist , dis); // min distance
                }
                listIdx = index;        // update previous critical index
            }

            prev = curr;
            curr = next;
            index++;                    // move to next index
        }

        int maxDist = listIdx - firstIdx;      // max distance

        if(maxDist == 0) maxDist = -1;
        if(minDist == Integer.MAX_VALUE) minDist = -1;
        return new int[]{minDist, maxDist};
    }

}
