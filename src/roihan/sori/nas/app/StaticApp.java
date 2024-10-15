package roihan.sori.nas.app;

import static roihan.sori.nas.data.Application.PROCESSORS;
import static roihan.sori.nas.data.Constant.*;
import roihan.sori.nas.data.Country;
import roihan.sori.nas.utils.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(3,4,6));

        Country.City city = new Country.City();
        city.setName("Subang");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
