import commonFunctions.CommonFunctions;

import java.util.*;

public class MinimumOperationsExceedThresholdValueII {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int[] nums = CommonFunctions.create1DArray(size);
        int k = CommonFunctions.getInt();
        int result = minOperations(nums, k);
        System.out.println(result);
    }

    private static int minOperations(int[] nums, int k) {
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();
        for (int num : nums) {
            priorityQueue.add((long) num);
        }
        int operation = 0;
        while (priorityQueue.peek() < k && priorityQueue.size() > 1) {
            long val0 = priorityQueue.poll();
            long val1 = priorityQueue.poll();
            long val = (Math.min(val0, val1) * 2) + Math.max(val0, val1);
            operation++;
            priorityQueue.add(val);
        }
        return operation;
    }
}
