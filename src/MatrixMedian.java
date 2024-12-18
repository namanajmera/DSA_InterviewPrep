import commonFunctions.CommonFunctions;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MatrixMedian {
    public static void main(String[] args) {
        int n = CommonFunctions.getInt();
        int m = CommonFunctions.getInt();
        ArrayList<ArrayList<Integer>> matrix = CommonFunctions.create2DArrayList(n, m);
        int result = getMedian(matrix);
        System.out.println(result);
    }

    private static int getMedian(ArrayList<ArrayList<Integer>> matrix) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int n = matrix.size();
        int m = matrix.get(0).size();
        for (ArrayList<Integer> integers : matrix) {
            for (int j = 0; j < m; j++) {
                priorityQueue.add(integers.get(j));
            }
        }
        int median = ((n * m) + 1) / 2;
        for (int i = 0; i < median - 1; i++) {
            priorityQueue.poll();
        }
        return priorityQueue.peek();
    }
}
