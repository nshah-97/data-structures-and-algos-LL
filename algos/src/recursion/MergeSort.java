package recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort(new int[]{3, 4, 51, 7, 13, 17, 52, 1});
        System.out.println(Arrays.toString(mergeSort.sort()));
    }

    private final int[] array;

    public MergeSort(int[] array) {
        this.array = array;
    }

    public int[] sort() {
        mergeSort(0, array.length - 1);
        return array;
    }

    private void merge(int start, int middle, int end) {
        int[] first = new int[middle - start + 1];
        int[] second = new int[end - middle];

        for (int i = 0; i < first.length; i++) {
            first[i] = array[start + i];
        }
        for (int j = 0; j < second.length; j++) {
            second[j] = array[middle + 1 + j];
        }
        int i = 0, j = 0;
        for (int k = start; k < end + 1; k++) {
            if ((j >= second.length) || (i < first.length && first[i] <= second[j])) {
                array[k] = first[i];
                i++;
            } else {
                array[k] = second[j];
                j++;
            }
        }
    }

    private void mergeSort(int start, int end) {
        if (start < end) {
            int middle = (int) Math.floor((float) (start + end) / 2);
            mergeSort(start, middle);
            mergeSort(middle + 1, end);
            merge(start, middle, end);
        }
    }
}
