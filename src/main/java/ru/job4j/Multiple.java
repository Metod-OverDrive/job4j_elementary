package ru.job4j;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Multiple {
    public static void main(String[] args) {
        try (var out = new FileOutputStream("data/data_res.txt")) {

            for (int i = 1; i < 10; i++) {
                out.write(("1 * " + i + " = " + i).getBytes());
                out.write(System.lineSeparator().getBytes());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
