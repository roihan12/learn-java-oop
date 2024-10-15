package roihan.sori.nas.app;


import roihan.sori.nas.annotation.Fancy;
import roihan.sori.nas.data.*;

@Fancy(name = "Application", tags = {"test1", "test2"})
public class Application {
    public static void main(String[] args) {
        Product product = new Product("Asus Tuf", 13_000_000);

        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();

    }

}
