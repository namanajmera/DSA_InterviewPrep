import commonFunctions.CommonFunctions;

public class RemoveAllOccurrencesASubstring {
    public static void main(String[] args) {
        String s = CommonFunctions.getString();
        String part = CommonFunctions.getString();
        String result = removeOccurrences(s, part);
        System.out.println(result);
    }

    private static String removeOccurrences(String s, String part) {
        while (s.contains(part)){
            s = removeSubString(part, s);
        }
        return s;
    }

    private static String removeSubString(String part, String s) {
        int startIndex = s.indexOf(part);
        if (startIndex != -1){
            int endIndex = startIndex + part.length();
            return s.substring(0,startIndex) + s.substring(endIndex);
        }
        return s;
    }
}
