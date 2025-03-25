package commonFunctions;

import java.util.ArrayList;
import java.util.List;

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

    public static List<Integer> inOrderTraversal(BinaryTreeNode<Integer> root) {
        if (root == null)
            return null;
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }

    private static void inOrder(BinaryTreeNode<Integer> root, List<Integer> result) {
        if (root == null)
            return;
        inOrder(root.left, result);
        result.add(root.data);
        inOrder(root.right, result);
    }


    public static List<Integer> postOrderTraversal(BinaryTreeNode<Integer> root) {
        if (root == null)
            return null;
        List<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }

    private static void postOrder(BinaryTreeNode<Integer> root, List<Integer> result) {
        if (root == null)
            return;
        postOrder(root.left, result);
        postOrder(root.right, result);
        result.add(root.data);
    }


    public static List<Integer> preOrderTraversal(BinaryTreeNode<Integer> root) {
        if (root == null)
            return null;
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;
    }

    private static void preOrder(BinaryTreeNode<Integer> root, List<Integer> result) {
        if (root == null)
            return;
        result.add(root.data);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }
}
