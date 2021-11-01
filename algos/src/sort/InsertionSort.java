package sort;

import java.util.Arrays;

public class InsertionSort implements Sorter {

    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1};
        int[] sortedNumbers = new InsertionSort().sort(numbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }

    @Override
    public int[] sort(int[] sort) {
        for (int i = 0; i < sort.length; i++) {
            int current = sort[i];
            int j = i - 1;
            while (j >= 0 && sort[j] > current) {
                sort[j + 1] = sort[j];
                j--;
            }
            sort[j + 1] = current;
        }

        return sort;
    }
}
