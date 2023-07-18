package ru.job4j.array;

import java.util.Arrays;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        System.out.println("Ages " + ages.length);
        System.out.println("Prices " + prices.length);
        System.out.println("Surnames " + surname.length);

        String[] names = new String[4];
        names[0] = "Petr";
        names[1] = "Oleg";
        names[2] = "Dima";
        names[3] = "Boris";
        System.out.println(Arrays.toString(names));
    }
}
