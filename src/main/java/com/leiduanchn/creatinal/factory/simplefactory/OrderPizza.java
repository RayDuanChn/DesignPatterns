package com.leiduanchn.creatinal.factory.simplefactory;

import com.leiduanchn.creatinal.factory.Pizza;

/**
 * 调用者， 调用静态工厂
 * @author leiduanchn
 * @create 2019-12-03 11:48 a.m.
 */
public class OrderPizza {

    public Pizza orderPizza(String name){
        return SimpleFactory.createPizza(name);
    }


    public Pizza orderPizza2(String name){

        if("greece".equals(name)){
            Pizza greecePizza = SimpleFactory.createGreecePizza();
            createPizza(greecePizza);
            return greecePizza;
        }else if("cheese".equals(name)){
            Pizza cheesePizza = SimpleFactory.createCheesePizza();
            createPizza(cheesePizza);
            return cheesePizza;
        }else{
            return null;
        }
    }

    private void createPizza(Pizza pizza){
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
