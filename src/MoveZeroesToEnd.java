import commonFunctions.CommonFunctions;

import java.util.ArrayList;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        ArrayList<Integer> arr = CommonFunctions.create1DArrayList(size);
        pushZerosAtEndBetter(arr);
        System.out.println(arr);
    }

    private static void pushZerosAtEnd(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != 0) {
                arr.set(count++, arr.get(i));
            }
        }
        while (count < arr.size()) {
            arr.set(count++, 0);
        }
    }

    private static void pushZerosAtEndBetter(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != 0) {
                CommonFunctions.swapArrayList(arr,i,count);
                count++;
            }
        }
    }
}
