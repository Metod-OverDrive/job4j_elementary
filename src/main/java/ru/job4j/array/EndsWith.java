package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            int wordIndex = word.length - 1;
            int postIndex = post.length - 1;
            if (word[wordIndex] != post[postIndex]) {
                result = false;
                break;
            }
        }
        return result;
    }
}