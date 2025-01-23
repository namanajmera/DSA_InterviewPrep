import commonFunctions.BinaryTreeFunctions;
import commonFunctions.BinaryTreeNode;
import commonFunctions.CommonFunctions;

public class LCABinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeFunctions.createBinaryTree();
        int x = CommonFunctions.getInt();
        int y = CommonFunctions.getInt();
        int result = lowestCommonAncestor(root, x, y);
        System.out.println(result);
    }

    private static int lowestCommonAncestor(BinaryTreeNode<Integer> root, int x, int y) {
        BinaryTreeNode<Integer> resultNode = lca(root, x, y);
        return resultNode.data;
    }

    private static BinaryTreeNode<Integer> lca(BinaryTreeNode<Integer> root, int x, int y) {
        if (root == null)
            return null;
        if (root.data == x || root.data == y)
            return root;
        BinaryTreeNode<Integer> left = lca(root.left, x, y);
        BinaryTreeNode<Integer> right = lca(root.right, x, y);
        if (left == null)
            return right;
        if (right == null)
            return left;
        return root;
    }
}
