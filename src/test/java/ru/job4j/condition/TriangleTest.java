package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    void whenAb3Bc4Ac5ThenTrue() {
        double ab = 3;
        double bc = 4;
        double ac = 5;
        boolean out = Triangle.exist(ab, ac, bc);
        assertThat(out).isTrue();
    }

    @Test
    void whenAb1Bc2Ac5ThenFalse() {
        double ab = 1;
        double bc = 2;
        double ac = 5;
        boolean out = Triangle.exist(ab, ac, bc);
        assertThat(out).isFalse();
    }

}