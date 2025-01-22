package commonFunctions;

public class BinaryTreeFunctions {

    public static BinaryTreeNode<Integer> createBinaryTree() {
        int value = CommonFunctions.getInt();
        if (value == -1)
            return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(value);
        System.out.print("Enter the left element of " + root.data + ":- ");
        root.left = createBinaryTree();
        System.out.print("Enter the right element of " + root.data + ":- ");
        root.right = createBinaryTree();
        return root;
    }

    public static void printBinaryTree(BinaryTreeNode<Integer> root) {
        if (root == null)
            return;
        printBinaryTree(root.left);
        printBinaryTree(root.right);
        System.out.print(root.data + " ");
    }
}
