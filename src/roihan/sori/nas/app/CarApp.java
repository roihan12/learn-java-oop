package roihan.sori.nas.app;

import roihan.sori.nas.data.Avanza;
import roihan.sori.nas.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
