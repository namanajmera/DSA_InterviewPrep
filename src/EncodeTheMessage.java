import commonFunctions.CommonFunctions;

public class EncodeTheMessage {
    public static void main(String[] args) {
        System.out.print("Enter the string:- ");
        String message = CommonFunctions.getString();
        String result = encode(message);
        System.out.println(result);
    }

    private static String encode(String message) {
        String result = String.valueOf(message.charAt(0));
        char lastChar = message.charAt(0);
        int count = 1;
        for (int i = 1; i < message.length(); i++) {
            if (lastChar == message.charAt(i)) {
                count++;
            } else {
                result += count;
                result += message.charAt(i);
                lastChar = message.charAt(i);
                count = 1;
            }
        }
        result += count;
        return result;
    }
}
