package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP4K1Then1() {
        double p = 4;
        double k = 1;
        double out = SqArea.square(p, k);
        double excepted = 1;
        assertThat(out).isEqualTo(excepted, withPrecision(0.01));
    }

    @Test
    void whenP6K2Then2() {
        double p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        double excepted = 2;
        assertThat(out).isEqualTo(excepted, withPrecision(0.01));
    }

    @Test
    void whenP18K2Then2() {
        double p = 18;
        double k = 2;
        double out = SqArea.square(p, k);
        double excepted = 18;
        assertThat(out).isEqualTo(excepted, withPrecision(0.01));
    }
}