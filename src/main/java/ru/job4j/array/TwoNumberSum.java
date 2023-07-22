package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {

        int[] result = new int[0];
        int j = 0;
        for (int i = 1; i < array.length; i++) {
                if (array[i] + array[j] == target) {
                    if (array[j] <= array[i]) {
                        result = new int[] {j, i};
                    } else {
                        result = new int[] {i, j};
                    }
                    break;
                } else if (array.length - i == 1) {
                    j++;
                    i = j + 1;
                }
        }
        return result;
    }
}