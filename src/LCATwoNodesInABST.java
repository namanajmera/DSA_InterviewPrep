import commonFunctions.BinaryTreeFunctions;
import commonFunctions.BinaryTreeNode;
import commonFunctions.CommonFunctions;

public class LCATwoNodesInABST {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeFunctions.createBinaryTree();
        BinaryTreeNode<Integer> x = new BinaryTreeNode<>(CommonFunctions.getInt());
        BinaryTreeNode<Integer> y = new BinaryTreeNode<>(CommonFunctions.getInt());
        BinaryTreeNode<Integer> result = LCAinaBST(root, x, y);
        System.out.println(result.data);
    }

    public static BinaryTreeNode<Integer> LCAinaBST(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> p, BinaryTreeNode<Integer> q) {
        return lca(root, p, q);
    }

    public static BinaryTreeNode<Integer> lca(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> x, BinaryTreeNode<Integer> y) {
        if (root == null)
            return null;
        if (root.data == x.data || root.data == y.data)
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
