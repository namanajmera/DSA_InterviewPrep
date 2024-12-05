import commonFunctions.CommonFunctions;

import java.util.HashMap;
import java.util.Map;

public class MakeUniqueArray {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array:- ");
        int size = CommonFunctions.getInt();
        System.out.print("Enter the elements:- ");
        int[] arr = CommonFunctions.create1DArray(size);
        int result = minElementsToRemove(arr);
        System.out.println(result);
    }

    private static int minElementsToRemove(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;
        for (int element : arr) {
            if (hashMap.containsKey(element)) {
                hashMap.put(element, hashMap.get(element) + 1);
                count++;
            } else {
                hashMap.put(element, 1);
            }
        }
        return count;
    }
}
