package com.leiduanchn.structural.bridge;

/**
 * @author leiduanchn
 * @create 2019-12-18 10:35 a.m.
 */
public abstract class Vehicle {

    protected WorkShop productWorkShop;
    protected WorkShop assembleWorkShop;

    public Vehicle(WorkShop productWorkShop, WorkShop assembleWorkShop) {
        this.productWorkShop = productWorkShop;
        this.assembleWorkShop = assembleWorkShop;
    }

    abstract void manufacture();



}
