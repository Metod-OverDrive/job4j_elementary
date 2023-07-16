package ru.job4j.condition;

import static java.lang.Math.abs;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (abs(x1 - x2) == abs(y1 - y2)) {
                rsl = abs(x1 - x2);

            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}