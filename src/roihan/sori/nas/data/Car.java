package roihan.sori.nas.data;

public interface Car extends HasBrand {
    void drive();

    int getTire();

    default boolean isBig() {
        return false;
    }
}
