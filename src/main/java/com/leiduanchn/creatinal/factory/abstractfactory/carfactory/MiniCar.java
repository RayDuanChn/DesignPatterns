package com.leiduanchn.creatinal.factory.abstractfactory.carfactory;

/**
 * @author leiduanchn
 * @create 2019-12-19 10:08 a.m.
 */
class MiniCar extends Car
{
    MiniCar(Location location)
    {
        super(CarType.MINI,location );
        construct();
    }

    @Override
    protected void construct()
    {
        System.out.println("Connecting to Mini car");
    }
}

