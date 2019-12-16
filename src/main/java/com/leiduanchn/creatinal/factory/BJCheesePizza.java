package com.leiduanchn.creatinal.factory;

/**
 * @author leiduanchn
 * @create 2019-12-03 2:27 p.m.
 */
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("BJCheesePizza");
        System.out.println("BJCheesePizza prepare ...");
    }
}
