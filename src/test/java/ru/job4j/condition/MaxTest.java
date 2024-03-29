package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when3To1Then3() {
        int left = 3;
        int right = 1;
        int excepted = 3;
        int out = Max.max(left, right);
        assertThat(out).isEqualTo(excepted);
    }

    @Test
    void when3To3Then3() {
        int left = 3;
        int right = 3;
        int excepted = 3;
        int out = Max.max(left, right);
        assertThat(out).isEqualTo(excepted);
    }

    @Test
    void when3To3To4Then4() {
        int left = 3;
        int right = 3;
        int another = 4;
        int excepted = 4;
        int out = Max.max(left, right, another);
        assertThat(out).isEqualTo(excepted);
    }

    @Test
    void when1To2To3To5Then5() {
        int left = 1;
        int right = 2;
        int another1 = 3;
        int another2 = 5;
        int excepted = 5;
        int out = Max.max(left, right, another1, another2);
        assertThat(out).isEqualTo(excepted);
    }
}