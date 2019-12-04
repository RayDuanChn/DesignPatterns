package com.leiduanchn.creation.factory;

/**
 * @author leiduanchn
 * @create 2019-12-03 2:27 p.m.
 */
public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("BJPepperPizza");
        System.out.println("BJPepperPizza prepare ...");
    }
}

