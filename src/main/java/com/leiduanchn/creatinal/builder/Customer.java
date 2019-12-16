package com.leiduanchn.creatinal.builder;

/**
 * @author leiduanchn
 * @create 2019-12-10 11:28 a.m.
 */

/* A customer ordering a pizza. */
public class Customer {

    public static void main(String[] args) {

       // 3.5 The client creates a Director object and a Builder object, and registers the latter with the former.
        Waiter waiter = new Waiter();
        CheesePizzaBuilder cheesePizzaBuilder = new CheesePizzaBuilder();
        waiter.setPizzaBuilder(cheesePizzaBuilder);
//        3.6 The client asks the Director to "construct".
//        3.7 The client asks the Builder to return the result.
        Pizza pizza = waiter.getPizza();


        SpicyPizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
        waiter.setPizzaBuilder(spicyPizzaBuilder);
        Pizza pizza1 = waiter.getPizza();

    }
}
