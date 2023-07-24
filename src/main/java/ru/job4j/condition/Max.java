package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int another1) {
        int temp = left > right ? left : right;
        return temp > another1 ? temp : another1;
    }

    public static int max(int left, int right, int another1, int another2) {
        int temp1 = left > right ? left : right;
        int temp2 = another1 > another2 ? another1 : another2;
        return temp1 > temp2 ? temp1 : temp2;
    }
}
