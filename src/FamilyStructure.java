import commonFunctions.CommonFunctions;

public class FamilyStructure {
    public static void main(String[] args) {
        int n = CommonFunctions.getInt();
        int k = CommonFunctions.getInt();
        String str = kthChildNthGeneration(n, k);
        System.out.println(str);
    }

    private static String kthChildNthGeneration(int n, int k) {
        String gender = "Male";
        if (k == 1)
            return "Male";
        while (n > 1) {
            if (k % 2 == 0) {
//                If even then flip the gender.
                gender = (gender == "Male") ? "Female" : "Male";
            }
            k = (k + 1) / 2;
            n--;
        }
        return gender;
    }
}
