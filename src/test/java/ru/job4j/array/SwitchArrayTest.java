package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {

    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void swapMidNumbersWhereLengthMore4() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int source = input[input.length / 2 - 2];
        int dest = input[input.length / 2 - 1];
        int[] out = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, 6, 5, 7, 8, 9, 10};
        assertThat(out).containsExactly(expected);
    }

}