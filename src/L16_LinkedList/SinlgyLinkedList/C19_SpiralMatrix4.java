package L16_LinkedList.SinlgyLinkedList;
// LeetCode : 2326

public class C19_SpiralMatrix4 {
    public int[][] spiralMatrix(int m, int n, Node head) {
        int[][] ans = new int[m][n];
        Node temp = head;
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        int i,j;

        while (left <= right && top <= bottom){
            i = top;
            for (j = left; j <= right; j++) {
                if(temp != null){
                    ans[i][j] = temp.value;
                    temp = temp.next;
                }else{
                    ans[i][j] = -1;
                }
            }
            top++;

            if(top > bottom) break;

            j = right;
            for (i = top; i <= bottom; i++) {
                if(temp != null){
                    ans[i][j] = temp.value;
                    temp = temp.next;
                }else{
                    ans[i][j] = -1;
                }
            }
            right--;

            if(left > right) break;

            i = bottom;
            for (j = right; j >= left; j--) {
                if(temp != null){
                    ans[i][j] = temp.value;
                    temp = temp.next;
                }else{
                    ans[i][j] = -1;
                }
            }
            bottom--;

            if(top > bottom) break;

            j = left;
            for (i = bottom; i >= top; i--) {
                if(temp != null){
                    ans[i][j] = temp.value;
                    temp = temp.next;
                }else{
                    ans[i][j] = -1;
                }
            }
            left++;
        }

        return ans;
    }
}
