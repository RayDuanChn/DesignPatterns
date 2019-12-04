package com.leiduanchn.creation.factory.abstractfactory;

import com.leiduanchn.creation.factory.Pizza;

/**
 * 抽象工厂接口
 * @author leiduanchn
 * @create 2019-12-04 11:05 a.m.
 */
public interface AbsFactory {
    /**
     * create Pizza
     * @return Pizza
     */
    Pizza createPizza(String type);
}
