import commonFunctions.CommonFunctions;

import java.util.ArrayList;
import java.util.HashMap;

public class MissingAndRepeatingNumbers {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        ArrayList<Integer> arr = CommonFunctions.create1DArrayList(size);
        int[] result = missingAndRepeating(arr, size);
        CommonFunctions.print1DArray(result);

    }

    private static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val = arr.get(i);
            hashMap.putIfAbsent(val, 0);
            hashMap.put(val, hashMap.get(val) + 1);
        }
        int i = 1;
        while (i < n + 1) {
            if (hashMap.containsKey(i) && hashMap.get(i) > 1) {
                result[1] = i;
            } else if (!hashMap.containsKey(i)) {
                result[0] = i;
            }
            i++;
        }
        return result;
    }
}
