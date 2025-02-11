import commonFunctions.BinaryTreeFunctions;
import commonFunctions.BinaryTreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LeftViewOfABinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeFunctions.createBinaryTree();
        ArrayList<Integer> arrayList = getLeftView(root);
        System.out.println(arrayList);
    }

    private static ArrayList<Integer> getLeftView(BinaryTreeNode<Integer> root) {
        if (root == null)
            return new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        getLeftViewHelper(root, 0, hashMap);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            arrayList.add(map.getValue());
        }
        return arrayList;
    }

    private static void getLeftViewHelper(BinaryTreeNode<Integer> root, int i, HashMap<Integer, Integer> hashMap) {
        if (root == null)
            return;
        if (!hashMap.containsKey(i)) {
            hashMap.put(i, root.data);
        }
        getLeftViewHelper(root.left, i + 1, hashMap);
        getLeftViewHelper(root.right, i + 1, hashMap);
    }
}
