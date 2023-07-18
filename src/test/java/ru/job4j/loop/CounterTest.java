package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumberFrom5to9then14() {
        int start = 5;
        int finish = 9;
        int out = Counter.sumByEven(start, finish);
        int excepted = 14;
        assertThat(out).isEqualTo(excepted);
    }
}