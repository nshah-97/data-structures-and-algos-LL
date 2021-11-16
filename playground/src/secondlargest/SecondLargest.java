package secondlargest;

public class SecondLargest {
    public static void main(String[] args) {
        System.out.println(getSecondLargest(new int[]{1, 2, 3, 4, 5, 6, 8, 8}));
    }

    public static int getSecondLargest(int[] arr) {
        int first, second;
        first = second = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > first) {
                second = first;
                first = j;
            }
        }
        return second;
    }
}
