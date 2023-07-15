package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
