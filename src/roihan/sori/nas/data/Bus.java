package roihan.sori.nas.data;

public class Bus implements  Car{
    public void drive() {
        System.out.println("Bus drive");
    }

    public int getTire() {
        return 8;
    }


    public String getBrand() {
        return "Hino";
    }


    public boolean isMaintenence() {
        return false;
    }


    public boolean isBig() {
        return true;
    }
}
