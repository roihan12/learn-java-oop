package roihan.sori.nas.app;

import roihan.sori.nas.data.City;
import roihan.sori.nas.data.Location;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); abstract

        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
