package roihan.sori.nas.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Mac book pro", 10000000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}
