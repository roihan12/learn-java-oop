package learn.java.standar.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {

        try {
            Properties properties = new Properties();

            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            System.out.println(port);
            System.out.println(host);


        } catch (FileNotFoundException e) {
            System.out.println("File tidak ada");
        } catch (IOException e) {
            System.out.println("Gagal bca file");
        }

        try {
            Properties properties = new Properties();
            properties.put("database.password", "pass");
            properties.store(new FileOutputStream("name.properties"), "coba");
        } catch (IOException e) {
            System.out.println("Erorr menyimpan");

        }
    }
}
