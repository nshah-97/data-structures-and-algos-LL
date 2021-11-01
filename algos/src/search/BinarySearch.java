package search;

import java.util.Objects;

public class BinarySearch {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int toFind = 141;
        SearchResult searchResult = new BinarySearch(numbers).find(toFind);
        System.out.println("Searched in " + searchResult.getSteps() + " steps.");
        if (searchResult.getResult() >= 0) {
            System.out.println("Found " + toFind + " at index " + searchResult.getResult() + ".");
        } else {
            System.out.println("Could not find " + toFind + ".");
        }
    }

    int[] orderedArray;

    public BinarySearch(int[] orderedArray) {
        this.orderedArray = orderedArray;
    }


    public SearchResult find(int number) {
        int head = 0;
        int tail = orderedArray.length - 1;
        int steps = 0;

        while (getNumOfElementsRemaining(head, tail) > 1) {
            int middle = getMiddleIndex(head, tail);
            steps++;
            if (orderedArray[middle] == number) {
                return new SearchResult(steps, middle);
            }
            if (orderedArray[middle] > number) {
                tail = middle - 1;
                continue;
            }
            if (orderedArray[middle] < number) {
                head = middle + 1;
            }
        }

        if (orderedArray[head] == number) {
            return new SearchResult(steps, head);
        } else {
            return new SearchResult(steps, -1);
        }


    }

    private int getMiddleIndex(int head, int tail) {
        return (int) Math.floor((float) (tail + head) / 2);
    }

    private int getNumOfElementsRemaining(int head, int tail) {
        return tail - head + 1;
    }

    private static class SearchResult {
        private final int steps;
        private final int result;

        public int getSteps() {
            return steps;
        }

        public int getResult() {
            return result;
        }

        public SearchResult(int steps, int result) {
            this.steps = steps;
            this.result = result;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SearchResult that = (SearchResult) o;
            return steps == that.steps && result == that.result;
        }

        @Override
        public int hashCode() {
            return Objects.hash(steps, result);
        }

        @Override
        public String toString() {
            return "SearchResult{" +
                    "steps=" + steps +
                    ", result=" + result +
                    '}';
        }
    }
}
