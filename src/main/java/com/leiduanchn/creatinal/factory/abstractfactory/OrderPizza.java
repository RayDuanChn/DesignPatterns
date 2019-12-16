package com.leiduanchn.creatinal.factory.abstractfactory;

import com.leiduanchn.creatinal.factory.Pizza;

/**
 * @author leiduanchn
 * @create 2019-12-04 11:15 a.m.
 */
public class OrderPizza {

    //组合工厂接口
    private AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory){
        this.factory = factory;
    }

    public Pizza getPizza(String orderType){
        Pizza pizza = factory.createPizza(orderType);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        }else {
            System.out.println("Order failed");
        }

        return pizza;
    }

}
