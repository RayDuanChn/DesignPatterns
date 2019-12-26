package com.leiduanchn.creatinal.factory.abstractfactory.carfactory;

/**
 * @author leiduanchn
 * @create 2019-12-19 10:15 a.m.
 */
public class DefaultCarFactory {

    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case MICRO:
                car = new MicroCar(Location.DEFAULT);
                break;

            case MINI:
                car = new MiniCar(Location.DEFAULT);
                break;

            case LUXURY:
                car = new LuxuryCar(Location.DEFAULT);
                break;

            default:
                break;

        }
        return car;
    }
}
