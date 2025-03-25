import commonFunctions.BinaryTreeFunctions;
import commonFunctions.BinaryTreeNode;

import java.util.List;

public class BinaryTreeTraversal {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeFunctions.createBinaryTree();
        List<Integer> inOrder = BinaryTreeFunctions.inOrderTraversal(root);
        List<Integer> postOrder = BinaryTreeFunctions.postOrderTraversal(root);
        List<Integer> preOrder = BinaryTreeFunctions.preOrderTraversal(root);
        System.out.println(inOrder);
        System.out.println(postOrder);
        System.out.println(preOrder);
    }
}
