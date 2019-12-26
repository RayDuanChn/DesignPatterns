package com.leiduanchn.creatinal.factory.abstractfactory.carfactory;

/**
 * @author leiduanchn
 * @create 2019-12-19 10:06 a.m.
 */
public class MicroCar extends Car {

    MicroCar(Location location)
    {
        super(CarType.MICRO,location );
        construct();
    }

    @Override
    protected void construct()
    {
        System.out.println("Connecting to Micro car");
    }
}
