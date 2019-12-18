package com.leiduanchn.structural.bridge;

/**
 * @author leiduanchn
 * @create 2019-12-18 10:54 a.m.
 */
public class MoteCycle extends Vehicle {

    public MoteCycle(WorkShop productWorkShop, WorkShop assembleWorkShop) {
        super(productWorkShop, assembleWorkShop);
    }

    @Override
    void manufacture() {
        System.out.println("MoteCycle ... ");
        productWorkShop.work();
        assembleWorkShop.work();
    }
}
