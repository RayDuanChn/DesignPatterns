package com.leiduanchn.structural.decorator;

/**
 *
 * @author leiduanchn
 * @create 2019-12-20 12:12 p.m.
 */
public class Coffee extends Drink {


    @Override
    int getCost() {
        return super.getPrice();
    }
}
