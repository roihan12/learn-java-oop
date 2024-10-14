package roihan.sori.nas.data;

import java.util.Objects;

public class Product{
    public String name;
    public int price;

   public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
       return "Product name: " + name + ", price " + price;
    }

//    public boolean equals(Object o) {
//       if (this == o) {
//           return true;
//       }
//
//       if (!(o instanceof  Product)) {
//           return  false;
//       }
//
//       Product product = (Product) o;
//
//       if(this.price != product.price) {
//           return false;
//       }
//
//       if(this.name != null) {
//           return this.name.equals(product.name);
//       } else  {
//           return  product.name == null;
//       }
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
