import commonFunctions.CommonFunctions;

import java.util.HashMap;

public class MaxProductCount {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int[] arr = CommonFunctions.create1DArray(size);
        long[] result = maxProductCount(arr, size);
        CommonFunctions.print1DLongArray(result);
    }

    private static long[] maxProductCount(int[] arr, int n) {
        long[] result = new long[2];
        HashMap<Long, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long val = (long) arr[i] * arr[j];
                hashMap.putIfAbsent(val, 0);
                hashMap.put(val, hashMap.get(val) + 1);
            }
        }
        long maxProd = 0;
        int freq = 0;
        for (Long prod : hashMap.keySet()) {
            if (hashMap.get(prod) >= freq) {
                if (hashMap.get(prod) == freq) {
                    maxProd = Math.min(maxProd, prod);
                } else {
                    maxProd = prod;
                }
                freq = hashMap.get(prod);
            }
        }
        if (hashMap.get(maxProd) == null || hashMap.get(maxProd) == 1) {
            result[0] = 0;
            result[1] = 0;
            return result;
        }
        int allCombinations = ((freq * (freq - 1)) / 2);
        result[0] = maxProd;
        result[1] = allCombinations;
        return result;
    }
}
