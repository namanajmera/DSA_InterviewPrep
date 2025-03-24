import commonFunctions.CommonFunctions;

public class CountDaysWithoutMeetings {
    public static void main(String[] args) {
        int n = CommonFunctions.getInt();
        int m = CommonFunctions.getInt();
        int[][] meetings = CommonFunctions.create2DArray(n, m);
        int days = CommonFunctions.getInt();
        int result = countDays(days, meetings);
        System.out.println(result);
    }

    private static int countDays(int days, int[][] meetings) {
        int count = 0;
        int[] arr = new int[days + 1];
        for (int i = 0; i < meetings.length; i++) {
            int start = meetings[i][0];
            int end = meetings[i][1];
            for (int j = start; j <= end; j++) {
                arr[j] += 1;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0)
                count++;
        }
        return count;
    }
}
