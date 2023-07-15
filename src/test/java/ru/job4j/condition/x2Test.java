package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class x2Test {

    @Test
    void whenA10B0C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int excepted = 40;
        int out = x2.calc(a, b, c, x);
        assertThat(out).isEqualTo(excepted);
    }

    @Test
    void whenA1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int excepted = 3;
        int out = x2.calc(a, b, c, x);
        assertThat(out).isEqualTo(excepted);
    }

    @Test
    void whenA0B1C1X1Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int excepted = 2;
        int out = x2.calc(a, b, c, x);
        assertThat(out).isEqualTo(excepted);
    }

    @Test
    void whenA1B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int excepted = 2;
        int out = x2.calc(a, b, c, x);
        assertThat(out).isEqualTo(excepted);
    }

    @Test
    void whenA1B1C1X0Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int excepted = 1;
        int out = x2.calc(a, b, c, x);
        assertThat(out).isEqualTo(excepted);
    }
}