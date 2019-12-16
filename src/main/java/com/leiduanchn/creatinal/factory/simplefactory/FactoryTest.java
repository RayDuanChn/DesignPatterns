package com.leiduanchn.creatinal.factory.simplefactory;

import com.leiduanchn.creatinal.factory.Pizza;

/**
 * @author leiduanchn
 * @create 2019-12-03 11:51 a.m.
 */
public class FactoryTest {

    public static void main(String[] args) {

        OrderPizza orderPizza = new OrderPizza();

        Pizza cheese = orderPizza.orderPizza2("cheese");
        Pizza greece = orderPizza.orderPizza2("greece");




    }
}
