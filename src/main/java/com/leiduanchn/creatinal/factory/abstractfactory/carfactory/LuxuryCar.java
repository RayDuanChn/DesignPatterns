package com.leiduanchn.creatinal.factory.abstractfactory.carfactory;

/**
 *
 * @author leiduanchn
 * @create 2019-12-19 10:04 a.m.
 */
public class LuxuryCar extends Car{

    public LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Connecting to luxury car");
    }
}
