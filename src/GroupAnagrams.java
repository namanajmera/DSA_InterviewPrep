import commonFunctions.CommonFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array of string:- ");
        int size = CommonFunctions.getInt();
        System.out.print("Enter the array of strings:- ");
        String[] strArray = CommonFunctions.create1DArrayString(size);
        ArrayList<ArrayList<String>> arrayLists = getGroupedAnagrams(strArray, size);
        System.out.println(arrayLists);
    }

    private static ArrayList<ArrayList<String>> getGroupedAnagrams(String[] strArray, int size) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        for (String word : strArray) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortedWord = Arrays.toString(ch);
            if (!hashMap.containsKey(sortedWord)) {
                hashMap.put(sortedWord, new ArrayList<>());
            }
            hashMap.get(sortedWord).add(word);
        }
        return new ArrayList<>(hashMap.values());
    }
}
