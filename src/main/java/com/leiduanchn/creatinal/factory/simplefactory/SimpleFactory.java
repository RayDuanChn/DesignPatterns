package com.leiduanchn.creatinal.factory.simplefactory;

import com.leiduanchn.creatinal.factory.CheesePizza;
import com.leiduanchn.creatinal.factory.GreecePizza;
import com.leiduanchn.creatinal.factory.Pizza;

/**
 * Simple Factory, (static factory),实现了创建者和调用者分离
 * 1.简单工厂也叫静态工厂模式，就是工厂类一般使用静态方法，通过接收的参数不同来返回不同的对象实例
 * 2.对于增加新产品无能为力！ 不修改代码的话，是无法扩展的
 *
 * @author leiduanchn
 * @create 2019-12-03 12:01 p.m.
 */

public class SimpleFactory {

    public static Pizza createPizza(String type){

        Pizza pizza;
        if("greece".equals(type)){
            pizza = new GreecePizza();
        }else if("cheese".equals(type)){
            pizza = new CheesePizza();
        }else{
            return null;
        }
        pizza.setName(type);
        createPizza(pizza);
        return pizza;

    }


    //另一种实现
    public static Pizza createGreecePizza(){
        return new GreecePizza();
    }
    public static Pizza createCheesePizza(){
        return new CheesePizza();
    }


    private static void createPizza(Pizza pizza){
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
