package com.leiduanchn.structural.decorator;

/**
 * concrete Decorator， 这里就是调味品
 *
 * @author leiduanchn
 * @create 2019-12-20 12:37 p.m.
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);

        setDescription("Chocolate");
        setPrice(5);
    }
}
