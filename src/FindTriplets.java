import commonFunctions.CommonFunctions;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTriplets {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int[] arr = CommonFunctions.create1DArray(size);
        ArrayList<Integer> result = findTriplets(arr, size);
        System.out.print(result);
    }

    private static ArrayList<Integer> findTriplets(int[] arr, int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i=0;i<size;i++){
            arrayList1.add(arr[i]);
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int add = arr[i] + arr[j];
                if (arrayList1.contains(add) && i != j){
                    arrayList.add(arr[i]);
                    arrayList.add(arr[j]);
                    arrayList.add(add);
                    return arrayList;
                }
            }
        }
        return arrayList;
    }
}
