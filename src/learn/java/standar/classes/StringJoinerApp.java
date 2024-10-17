package learn.java.standar.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",", "[","]");

        joiner.add("Roihan");
        joiner.add("Sori");

        String value = joiner.toString();
        System.out.println(value);
    }
}
