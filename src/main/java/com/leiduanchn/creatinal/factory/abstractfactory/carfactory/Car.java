package com.leiduanchn.creatinal.factory.abstractfactory.carfactory;

/**
 * Product
 *
 * @author leiduanchn
 * @create 2019-12-19 10:00 a.m.
 */
public abstract class Car {

    private CarType model;
    private Location location;

    public Car(CarType model, Location location) {
        this.model = model;
        this.location = location;
    }

    protected abstract void construct();

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", location=" + location +
                '}';
    }
}


enum CarType{
    MICRO, MINI, LUXURY
}


enum Location
{
    DEFAULT, USA, INDIA
}
