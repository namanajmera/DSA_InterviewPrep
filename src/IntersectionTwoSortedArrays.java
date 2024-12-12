import commonFunctions.CommonFunctions;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionTwoSortedArrays {
    public static void main(String[] args) {
        System.out.print("Enter the size of 1st array:- ");
        int size1 = CommonFunctions.getInt();
        System.out.print("Enter arrays;- ");
        ArrayList<Integer> arr1 = CommonFunctions.create1DArrayList(size1);
        System.out.print("Enter the size of 2nd array:- ");
        int size2 = CommonFunctions.getInt();
        System.out.print("Enter arrays;- ");
        ArrayList<Integer> arr2 = CommonFunctions.create1DArrayList(size2);
        ArrayList<Integer> result = findArrayIntersection(arr1, arr2, size1, size2);
        System.out.println(result);
    }

    private static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hashMap.containsKey(arr1.get(i))) {
                hashMap.put(arr1.get(i), hashMap.get(arr1.get(i)) + 1);
            } else {
                hashMap.put(arr1.get(i), 1);
            }
        }
        for (int i = 0; i < m; i++) {
            if (hashMap.containsKey(arr2.get(i))) {
                int value = hashMap.get(arr2.get(i));
                if (value != 0) {
                    hashMap.put(arr2.get(i), value - 1);
                    result.add(arr2.get(i));
                }
            }
        }
        if (result.isEmpty()) {
            ArrayList<Integer> result2 = new ArrayList<>();
            result2.add(-1);
            return result2;
        }
        return result;
    }
}
