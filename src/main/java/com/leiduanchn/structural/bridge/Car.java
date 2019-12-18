package com.leiduanchn.structural.bridge;

/**
 * @author leiduanchn
 * @create 2019-12-18 10:37 a.m.
 */
public class Car extends Vehicle {

    public Car(WorkShop productWorkShop, WorkShop assembleWorkShop) {
        super(productWorkShop, assembleWorkShop);
    }

    @Override
    void manufacture() {
        System.out.println("Car ... ");
        productWorkShop.work();
        assembleWorkShop.work();
    }
}
