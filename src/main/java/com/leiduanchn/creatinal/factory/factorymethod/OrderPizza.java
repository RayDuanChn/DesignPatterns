package com.leiduanchn.creatinal.factory.factorymethod;

import com.leiduanchn.creatinal.factory.Pizza;

/**
 * 工厂方法模式和简单工厂模式的最大不同在于，简单工厂模式只有一个(对于一个项目或者一个独立模块而言)工厂类，而工厂方法模式有一组实现了相同接口的工厂类。
 * 缺点：每个具体类都有一个对应的工厂类，会多出很多的类，开发中通常使用简单工厂模式
 *
 * @author leiduanchn
 * @create 2019-12-03 2:33 p.m.
 */

//工厂类的接口
public interface OrderPizza {

    //定义一个方法，createPizza , 让各个工厂子类自己实现
    Pizza createPizza(String type);

    default void processPizza(Pizza pizza){
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
