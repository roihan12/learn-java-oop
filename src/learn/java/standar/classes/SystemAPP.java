package learn.java.standar.classes;

public class SystemAPP {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv("ROIHAN"));


        System.gc();
        System.exit(1);
        System.out.println("Hi");

    }
}
