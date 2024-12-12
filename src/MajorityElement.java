// Moore’s Voting Algorithm

import commonFunctions.CommonFunctions;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array:- ");
        int size = CommonFunctions.getInt();
        System.out.print("Enter the elements:- ");
        int[] arr = CommonFunctions.create1DArray(size);
//        int result = findMajority(arr, size);
        int result = findMajorityUsingAlgo(arr, size);
        System.out.println(result);
    }

    private static int findMajorityUsingAlgo(int[] arr, int n) {
        int ans = 0, freq = 0;
        for (int i = 0; i < n; i++) {
            if (freq == 0)
                ans = arr[i];
            if (ans == arr[i])
                freq++;
            else
                freq--;
        }
        return ans;
    }

    private static int findMajority(int[] arr, int size) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        int value = 0, maxKey = -1;
        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            if (map.getValue() > size / 2) {
                if (value < map.getValue()) {
                    value = map.getValue();
                    maxKey = map.getKey();
                }
            }
        }
        return maxKey;
    }
}
