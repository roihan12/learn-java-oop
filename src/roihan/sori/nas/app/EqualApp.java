package roihan.sori.nas.app;

public class EqualApp {
    public static void main(String[] args) {
        String first = "Roihan";

        first = first + " " + "Sori";

        System.out.println(first);

        String second = "Roihan Sori";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Roihan Sori";

        System.out.println(third == second);
        System.out.println(second.equals(third));
    }
}
