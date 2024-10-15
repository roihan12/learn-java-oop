package roihan.sori.nas.app;

import roihan.sori.nas.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectionDatabase(null, null);
        System.out.println("sukses");
    }

    public static void connectionDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa connect database");
        }
    }
}
