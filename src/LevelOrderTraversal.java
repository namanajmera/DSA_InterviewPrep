import commonFunctions.BinaryTreeFunctions;
import commonFunctions.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeFunctions.createBinaryTree();
//        BinaryTreeFunctions.printBinaryTree(root);
        ArrayList<Integer> result = getLevelOrder(root);
        System.out.println(result);
    }

    private static ArrayList<Integer> getLevelOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode<Integer> tempRoot = queue.remove();
            arrayList.add(tempRoot.data);
            if (tempRoot.left != null)
                queue.offer(tempRoot.left);
            if (tempRoot.right != null)
                queue.offer(tempRoot.right);
        }
        return arrayList;
    }
}
