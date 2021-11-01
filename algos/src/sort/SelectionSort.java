package sort;

import java.util.Arrays;

public class SelectionSort implements Sorter{

    public static void main(String[] args) {
        int[] data = {5, 4, 3, 2, 1};
        new SelectionSort().sort(data);
        System.out.println(Arrays.toString(data));
    }

    public int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int indexOfSmallest = findIndexOfSmallest(Arrays.copyOfRange(numbers, i, numbers.length)) + i;
            int temp = numbers[indexOfSmallest];
            numbers[indexOfSmallest] = numbers[i];
            numbers[i] = temp;
        }
        return numbers;
    }

    private int findIndexOfSmallest(int[] numbers) {
        int indexOfSmallest=0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers[indexOfSmallest]) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
}
