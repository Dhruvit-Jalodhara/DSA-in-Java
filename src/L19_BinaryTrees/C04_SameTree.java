package L19_BinaryTrees;

// LeetCode no : 100

public class C04_SameTree {

    public boolean isSameTree(Node p, Node q) {
        if (p == null && q == null)
            return true;

        if(p == null || q == null)
            return false;

        if(p.value != q.value)
            return false;

        return isSameTree(p.left , q.left) && isSameTree(p.right , q.right);
    }

}
