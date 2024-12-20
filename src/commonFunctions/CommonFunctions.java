package commonFunctions;

import java.util.ArrayList;
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
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[][] create2DArray(int n, int m) {
        int[][] matrix = new int[n][m];
        System.out.println("Enter the matrix value of size " + n + " X " + m + ":- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = getInt();
            }
        }
        return matrix;
    }

    public static void print2DArray(int[][] matrix, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print2DArrayInLine(int[][] matrix, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    public static String[] create1DArrayString(int size) {
        String[] arr = new String[size];
        sc.nextLine();
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLine();
        }
        return arr;
    }

    public static void swapArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapArrayList(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    public static ArrayList<Integer> create1DArrayList(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(getInt());
        }
        return arrayList;
    }

    public static void print1DLongArray(long[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static ArrayList<ArrayList<Integer>> create2DArrayList(int n, int n1) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> arrayList1 = new ArrayList<>();
            for (int j = 0; j < n1; j++) {
                arrayList1.add(getInt());
            }
            arrayList.add(arrayList1);
        }
        return arrayList;
    }
}
