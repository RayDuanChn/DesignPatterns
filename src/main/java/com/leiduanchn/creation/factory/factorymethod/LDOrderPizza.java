package com.leiduanchn.creation.factory.factorymethod;

import com.leiduanchn.creation.factory.LDCheesePizza;
import com.leiduanchn.creation.factory.LDPepperPizza;
import com.leiduanchn.creation.factory.Pizza;

/**
 * 工厂类
 * @author leiduanchn
 * @create 2019-12-03 2:35 p.m.
 */
public class LDOrderPizza implements OrderPizza {

    public Pizza createPizza(String type) {

        Pizza pizza = null;
        if("pepper".equals(type)){
            pizza = new LDPepperPizza();
            processPizza(pizza);
        }else if("cheese".equals(type)){
            pizza = new LDCheesePizza();
            processPizza(pizza);
        }

        return pizza;
    }
}
