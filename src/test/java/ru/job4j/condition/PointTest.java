package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10to00then1() {
        double expected = 1;
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 0);
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when22to20then2() {
        double expected = 2;
        Point point1 = new Point(2, 2);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10to20then1() {
        double expected = 1;
        Point point1 = new Point(1, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

}