package com.leiduanchn.creation.factory;

/**
 * @author leiduanchn
 * @create 2019-12-03 2:27 p.m.
 */
public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("LDCheesePizza");
        System.out.println("LDCheesePizza prepare ...");
    }
}

