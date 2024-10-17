package learn.java.standar.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();

        String example = "100.00";

        Double contohInt = Double.valueOf(example);
//        double contohDouble =
        System.out.println(contohInt);

    }
}
