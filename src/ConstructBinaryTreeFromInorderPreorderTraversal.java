import commonFunctions.BinaryTreeFunctions;
import commonFunctions.BinaryTreeNode;
import commonFunctions.CommonFunctions;

import java.util.HashMap;

public class ConstructBinaryTreeFromInorderPreorderTraversal {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int[] preorder = CommonFunctions.create1DArray(size);
        int[] inorder = CommonFunctions.create1DArray(size);
        BinaryTreeNode<Integer> root = buildBinaryTree(inorder, preorder);
        BinaryTreeFunctions.printBinaryTree(root);
    }

    private static BinaryTreeNode<Integer> buildBinaryTree(int[] inorder, int[] preorder) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            hashMap.put(inorder[i], i);
        }
        int preStart = 0, preEnd = preorder.length - 1, inStart = 0, inEnd = inorder.length - 1;
        return buildTree(preorder, preStart, preEnd, inorder, inStart, inEnd, hashMap);
    }

    private static BinaryTreeNode<Integer> buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, HashMap<Integer, Integer> hashMap) {
        if (preStart > preEnd || inStart > inEnd)
            return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(preorder[preStart]);
        int inRoot = hashMap.get(root.data);
        int newLength = inRoot - inStart;

        root.left = buildTree(preorder, preStart + 1, preStart + newLength, inorder, inStart, inRoot - 1, hashMap);
        root.right = buildTree(preorder, preStart + 1 + newLength, preEnd, inorder, inRoot + 1, inEnd, hashMap);
        return root;
    }
}
