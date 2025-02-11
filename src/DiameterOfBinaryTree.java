import commonFunctions.BinaryTreeFunctions;
import commonFunctions.BinaryTreeNode;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeFunctions.createBinaryTree();
        int result = diameterOfBinaryTree(root);
        System.out.println(result);
    }

    static int ans = 0;

    private static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
        heightWithDia(root);
        return ans;
    }

    private static int heightWithDia(BinaryTreeNode<Integer> root) {
        if (root == null)
            return 0;
        int lh = heightWithDia(root.left);
        int rh = heightWithDia(root.right);
        ans = Math.max(ans, lh + rh);
        return 1 + Math.max(lh, rh);
    }
}
