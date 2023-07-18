package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean temp = data[0];
        for (boolean el: data) {
            if (temp != el) {
                return false;
            }
        }
        return result;
    }
}