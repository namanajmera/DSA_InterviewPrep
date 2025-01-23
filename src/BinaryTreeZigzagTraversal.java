import commonFunctions.BinaryTreeFunctions;
import commonFunctions.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagTraversal {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeFunctions.createBinaryTree();
        List<Integer> result = zigZagTraversal(root);
        System.out.println(result);
    }

    private static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
        if (root == null)
            return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        boolean leftToRight = true;
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> tempList = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                BinaryTreeNode<Integer> node = queue.remove();
                if (leftToRight)
                    tempList.add(node.data);
                else
                    tempList.add(0, node.data);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            result.addAll(tempList);
            leftToRight = !leftToRight;
        }
        return result;
    }
}
