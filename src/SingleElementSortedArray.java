import commonFunctions.CommonFunctions;

import java.util.ArrayList;
import java.util.Objects;

public class SingleElementSortedArray {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        ArrayList<Integer> arrayList = CommonFunctions.create1DArrayList(size);
        int result = singleNonDuplicate(arrayList);
        System.out.println(result);
    }

    private static int singleNonDuplicate(ArrayList<Integer> arrayList) {
        if (arrayList.size() == 1){
            return arrayList.getFirst();
        }
        int start = 0, end = arrayList.size();
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (mid == 0 && !Objects.equals(arrayList.get(mid + 1), arrayList.get(mid))) {
                return arrayList.get(mid);
            } else if (mid == arrayList.size() - 1 && !Objects.equals(arrayList.get(mid - 2), arrayList.get(mid))) {
                return arrayList.get(mid);
            } else if (!Objects.equals(arrayList.get(mid), arrayList.get(mid - 1)) && !Objects.equals(arrayList.get(mid), arrayList.get(mid + 1))) {
                return arrayList.get(mid);
            }
            if (mid % 2 == 0) {
                if (Objects.equals(arrayList.get(mid - 1), arrayList.get(mid))) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            } else {
                if (Objects.equals(arrayList.get(mid - 1), arrayList.get(mid))) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            }
        }
        return -1;
    }
}
