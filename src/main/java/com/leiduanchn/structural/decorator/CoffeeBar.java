package com.leiduanchn.structural.decorator;

/**
 * @author leiduanchn
 * @create 2019-12-20 12:39 p.m.
 */
public class CoffeeBar {

    public static void main(String[] args) {

        // 装饰者模式下的订单：2份巧克力+一份牛奶的Espresso

        Drink drink = new Espresso();

        System.out.println(drink.getCost());
        System.out.println(drink.getDescription());

        drink = new Milk(drink);

        System.out.println(drink.getCost());
        System.out.println(drink.getDescription());

        drink = new Milk(drink);

        System.out.println(drink.getCost());
        System.out.println(drink.getDescription());

        drink = new Chocolate(drink);

        System.out.println("order 加入2份牛奶 加入1份巧克力   费用 =" + drink.getCost());
        System.out.println("order 加入2份牛奶 加入1份巧克力 描述 = " + drink.getDescription());
    }
}
