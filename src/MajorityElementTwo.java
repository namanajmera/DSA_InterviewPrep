import commonFunctions.CommonFunctions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityElementTwo {
    public static void main(String[] args) {

        System.out.print("Enter the size of an array:- ");
        int size = CommonFunctions.getInt();
        System.out.print("Enter the elements:- ");
        int[] arr = CommonFunctions.create1DArray(size);
        ArrayList<Integer> result = findMajority(arr, size);
        System.out.println(result);
    }

    private static ArrayList<Integer> findMajority(int[] arr, int size) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            if (map.getValue() > size / 3) {
                arrayList.add(map.getKey());
            }
        }
        return arrayList;
    }
}
