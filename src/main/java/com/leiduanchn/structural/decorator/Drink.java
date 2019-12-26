package com.leiduanchn.structural.decorator;

/**
 *  Abstract Drink class (All classes extend from this)
 *
 * @author leiduanchn
 * @create 2019-12-20 12:08 p.m.
 */
public abstract class Drink {
    private String name;
    protected String description;
    private int price;

    //计算费用的抽象方法
    //子类来实现
    abstract int getCost();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
