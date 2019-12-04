package com.leiduanchn.creation.factory.factorymethod;


import com.leiduanchn.creation.factory.BJCheesePizza;
import com.leiduanchn.creation.factory.BJPepperPizza;
import com.leiduanchn.creation.factory.Pizza;

/**
 * 工厂类
 * @author leiduanchn
 * @create 2019-12-03 2:35 p.m.
 */
public class BJOrderPizza implements OrderPizza {

    public Pizza createPizza(String type) {

        Pizza pizza = null;
        if("pepper".equals(type)){
            pizza = new BJPepperPizza();
            processPizza(pizza);
        }else if("cheese".equals(type)){
            pizza = new BJCheesePizza();
            processPizza(pizza);
        }

        return pizza;
    }
}
