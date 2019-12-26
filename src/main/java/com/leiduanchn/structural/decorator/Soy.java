package com.leiduanchn.structural.decorator;

/**
 * @author leiduanchn
 * @create 2019-12-20 12:38 p.m.
 */
public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);

        setDescription("Soy");
        setPrice(1);
    }
}
