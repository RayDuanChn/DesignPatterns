package com.leiduanchn.structural.decorator;

/**
 * @author leiduanchn
 * @create 2019-12-20 12:36 p.m.
 */
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        setDescription("Milk");
        setPrice(3);
    }
}
