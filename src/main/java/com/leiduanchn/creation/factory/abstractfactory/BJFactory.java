package com.leiduanchn.creation.factory.abstractfactory;

import com.leiduanchn.creation.factory.*;

/**
 * 工厂接口实现类
 * @author leiduanchn
 * @create 2019-12-04 11:07 a.m.
 */
public class BJFactory implements AbsFactory{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if("pepper".equals(type)){
            pizza = new BJPepperPizza();
        }else if("cheese".equals(type)){
            pizza = new BJCheesePizza();
        }

        return pizza;
    }
}

