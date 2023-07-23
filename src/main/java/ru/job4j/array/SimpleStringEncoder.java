package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {

        String result = "";
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i - 1) == input.charAt(i)) {
                counter++;
            } else if (counter > 1) {
                result = result + input.charAt(i - 1) + counter;
                counter = 1;
            } else {
                result = result + input.charAt(i - 1);
            }
        }

        result = counter > 1
                ? result + input.charAt(input.length() - 1) + counter
                : result + input.charAt(input.length() - 1);

        return result;
    }
}