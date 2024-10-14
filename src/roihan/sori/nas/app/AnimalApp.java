package roihan.sori.nas.app;

import roihan.sori.nas.data.Animal;
import roihan.sori.nas.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();

    }
}
