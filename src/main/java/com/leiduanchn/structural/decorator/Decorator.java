package com.leiduanchn.structural.decorator;

/**
 * The decorator class
 *
 * @author leiduanchn
 * @create 2019-12-20 12:15 p.m.
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) { //组合
        this.drink = drink;
    }

    @Override
    int getCost() {
        //getPrice 自己价格
        return super.getPrice() + drink.getCost();
    }

    @Override
    public String getDescription() {
        // drink.getDescription() 输出被装饰者的信息
        return description + " " + getPrice() + " && " + drink.getDescription();
    }
}

