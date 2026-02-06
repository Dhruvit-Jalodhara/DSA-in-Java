package L16_LinkedList;

// LeetCode : 725

public class C32_SplitLinkedListInParts {
    public Node[] splitListToParts(Node head, int k) {
        Node[] ans = new Node[k];

        for (int i = 0; i < k; i++) {
            int n = length(head);
            if(n == 0) break;

            int l = (n % (k-i) == 0) ? n/(k-i) : n/(k-i) + 1;

            Node temp = head;
            for (int j = 1; j < l; j++) {
                if(temp == null) break;
                temp = temp.next;
            }
            ans[i] = head;
            if(temp != null) {
                head = temp.next;
                temp.next = null;
            }
        }

        return ans;
    }
    public int length(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
