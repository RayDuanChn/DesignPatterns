package com.leiduanchn.creatinal.factory.factorymethod;

import com.leiduanchn.creatinal.factory.Pizza;

/**
 * @author leiduanchn
 * @create 2019-12-03 2:45 p.m.
 */
public class Test {
    public static void main(String[] args) {

        //创建北京口味的各种Pizza
        Pizza pepper = new BJOrderPizza().createPizza("pepper");
        //创建北伦敦口味的各种Pizza
        Pizza pepper1 = new LDOrderPizza().createPizza("cheese");

    }
}
