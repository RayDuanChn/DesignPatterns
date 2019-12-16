package com.leiduanchn.creatinal.factory.abstractfactory;

import com.leiduanchn.creatinal.factory.LDCheesePizza;
import com.leiduanchn.creatinal.factory.LDPepperPizza;
import com.leiduanchn.creatinal.factory.Pizza;

/**
 * 工厂接口实现类
 * @author leiduanchn
 * @create 2019-12-04 11:14 a.m.
 */
public class LDFactory implements AbsFactory{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if("pepper".equals(type)){
            pizza = new LDPepperPizza();
        }else if("cheese".equals(type)){
            pizza = new LDCheesePizza();
        }

        return pizza;
    }
}
