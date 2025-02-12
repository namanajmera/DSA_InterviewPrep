import commonFunctions.BinaryTreeFunctions;
import commonFunctions.BinaryTreeNode;

import java.util.*;

public class TopViewOfBinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeFunctions.createBinaryTree();
        List<Integer> result = getTopView(root);
        System.out.println(result);
    }

    private static List<Integer> getTopView(BinaryTreeNode<Integer> root) {
        Queue<Pair> pairQueue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        TreeMap<Integer, Integer> hashMap = new TreeMap<>();
        pairQueue.add(new Pair(0, root));
        while (!pairQueue.isEmpty()) {
            Pair cur = pairQueue.poll();
            if (!hashMap.containsKey(cur.hd)) {
                hashMap.put(cur.hd, cur.node.data);
            }
            if (cur.node.left != null) {
                pairQueue.add(new Pair(cur.hd - 1, cur.node.left));
            }
            if (cur.node.right != null)
                pairQueue.add(new Pair(cur.hd + 1, cur.node.right));

        }
        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            list.add(map.getValue());
        }
        return list;
    }
}

class Pair {
    int hd;
    BinaryTreeNode<Integer> node;

    Pair(int hd, BinaryTreeNode<Integer> node) {
        this.hd = hd;
        this.node = node;
    }
}
