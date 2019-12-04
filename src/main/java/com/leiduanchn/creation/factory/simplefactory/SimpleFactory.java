package com.leiduanchn.creation.factory.simplefactory;

import com.leiduanchn.creation.factory.CheesePizza;
import com.leiduanchn.creation.factory.GreecePizza;
import com.leiduanchn.creation.factory.Pizza;

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

        if("greece".equals(type)){
            return new GreecePizza();
        }else if("cheese".equals(type)){
            return new CheesePizza();
        }else{
            return null;
        }
    }


    //另一种实现
    public static Pizza createGreecePizza(){
        return new GreecePizza();
    }
    public static Pizza createCheesePizza(){
        return new CheesePizza();
    }
}
