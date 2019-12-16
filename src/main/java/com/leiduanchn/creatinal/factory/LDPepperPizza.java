package com.leiduanchn.creatinal.factory;

/**
 * @author leiduanchn
 * @create 2019-12-03 2:27 p.m.
 */
public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {

        setName("LDPepperPizza");
        System.out.println("LDPepperPizza prepare ...");
    }
}
