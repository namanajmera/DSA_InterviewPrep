package commonFunctions;

import java.util.Scanner;

public class CommonFunctions {
    static Scanner sc = new Scanner(System.in);

    public static int getInt() {
        return sc.nextInt();
    }

    public static long getLong() {
        return sc.nextLong();
    }

    public static String getString() {
        return sc.nextLine();
    }

    public static char getChar() {
        return sc.next().charAt(0);
    }

    public static int[] create1DArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = getInt();
        }
        return arr;
    }

    public static void print1DArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
