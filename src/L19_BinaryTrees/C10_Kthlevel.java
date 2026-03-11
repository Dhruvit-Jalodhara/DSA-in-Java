package L19_BinaryTrees;

public class C10_Kthlevel {
    public void kThLevelElement(Node root, int level, int k) {
        if (root == null || level > k)
            return;

        if (level == k) {
            System.out.print(root.value + " ");
            return;
        }

        kThLevelElement(root.left, level + 1, k);
        kThLevelElement(root.right, level + 1, k);
    }
}
