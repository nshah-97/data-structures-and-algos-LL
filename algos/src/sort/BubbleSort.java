package sort;

import java.util.Arrays;

public class BubbleSort implements Sorter {

    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1};
        int[] sortedNumbers = new BubbleSort().sort(numbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }

    public int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }


}
