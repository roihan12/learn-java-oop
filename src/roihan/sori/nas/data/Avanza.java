package roihan.sori.nas.data;

public class Avanza implements Car, IsMaintenence{

    public void drive() {
        System.out.println("Avanza drive");
    }

    public int getTire() {
        return 4;
    }


    public String getBrand() {
        return "Toyota";
    }


    public boolean isMaintenence() {
        return false;
    }
}
