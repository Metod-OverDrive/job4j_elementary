package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short in = 180;
        double out = Fit.manWeight(in);
        double expected = 92;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short in = 170;
        double out = Fit.womanWeight(in);
        double expected = 69;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}