import commonFunctions.CommonFunctions;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueBinaryString {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        String[] nums = CommonFunctions.create1DArrayString(size);
        String ans = findDifferentBinaryString(nums);
        System.out.println(ans);
    }

    private static String findDifferentBinaryString(String[] nums) {
        int totalBinaryLength = (int) Math.pow(2, nums.length);
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i <= totalBinaryLength; i++) {
            String binary = Integer.toBinaryString(i);
            binary = String.format("%" + nums.length + "s", binary).replace(' ', '0');
            hashMap.putIfAbsent(binary, 1);
        }
        for (String num : nums) {
            hashMap.put(num, 0);
        }
        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            if (map.getValue() == 1) {
                return map.getKey();
            }
        }
        return "";
    }
}
