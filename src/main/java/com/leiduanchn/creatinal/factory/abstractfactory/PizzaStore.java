package com.leiduanchn.creatinal.factory.abstractfactory;

import com.leiduanchn.creatinal.factory.Pizza;

/**
 * @author leiduanchn
 * @create 2019-12-04 11:27 a.m.
 */
public class PizzaStore {

    public static void main(String[] args) {

        Pizza cheese = new OrderPizza(new BJFactory()).getPizza("cheese");
        Pizza pepper = new OrderPizza(new LDFactory()).getPizza("pepper");
        System.out.println(cheese);
        System.out.println(pepper);
    }
}
