import commonFunctions.CommonFunctions;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array:- ");
        int size = CommonFunctions.getInt();
        System.out.print("Enter the elements:- ");
        int[] height = CommonFunctions.create1DArray(size);
        int result = maxArea(height);
        System.out.print(result);
    }

    private static int maxArea(int[] height) {
        int size = height.length;
        int i = 0, j = size - 1, maxArea = Integer.MIN_VALUE;
        while (i < j) {
            int currentArea = (j - i) * Math.min(height[i], height[j]);
            maxArea = Math.max(currentArea, maxArea);
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return maxArea;
    }
}
