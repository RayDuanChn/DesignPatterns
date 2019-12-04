package com.leiduanchn.creation.factory;

/**
 * @author leiduanchn
 * @create 2019-12-03 11:45 a.m.
 */
public class CheesePizza extends Pizza {

    public void prepare() {
        setName("CheesePizza");
        System.out.println("CheesePizza prepare ...");
    }
}

