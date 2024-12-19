import commonFunctions.CommonFunctions;

import java.util.ArrayList;
import java.util.Arrays;

public class FindKElement {
    public static void main(String[] args) {
        int size1 = CommonFunctions.getInt();
        int size2 = CommonFunctions.getInt();
        int k = CommonFunctions.getInt();
        ArrayList<Integer> arr1 = CommonFunctions.create1DArrayList(size1);
        ArrayList<Integer> arr2 = CommonFunctions.create1DArrayList(size2);
        int result = findKthElement(arr1, arr2, k);
        System.out.println(result);
    }

    private static int findKthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        ArrayList<Integer> arrayList = mergeSortArray(arr1, arr2);
        return arrayList.get(k - 1);
    }

    private static ArrayList<Integer> mergeSortArray(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> arrayList = new ArrayList<>(arr1.size() + arr2.size());
        int i1 = 0, i2 = 0;
        while (i1 < arr1.size() && i2 < arr2.size()) {
            if (arr1.get(i1) <= arr2.get(i2)) {
                arrayList.add(arr1.get(i1++));
            } else {
                arrayList.add(arr2.get(i2++));
            }
        }

        while (i1 < arr1.size()) {
            arrayList.add(arr1.get(i1++));
        }

        while (i2 < arr2.size()) {
            arrayList.add(arr2.get(i2++));
        }
        return arrayList;
    }
}
