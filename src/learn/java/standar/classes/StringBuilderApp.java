package learn.java.standar.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Roihana");
        builder.append(" ");
        builder.append("Sori");

        String name = builder.toString();
        System.out.println(name);
    }
}

