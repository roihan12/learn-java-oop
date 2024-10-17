package learn.java.standar.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {

        String name = "Roihan Sori";

        StringTokenizer tokenTest = new StringTokenizer(name, " ");


        while (tokenTest.hasMoreTokens()) {
            String token = tokenTest.nextToken();
            System.out.println(token);

        }
    }
}
