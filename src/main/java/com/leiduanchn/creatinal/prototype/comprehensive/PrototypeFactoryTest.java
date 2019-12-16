package com.leiduanchn.creatinal.prototype.comprehensive;

/**
 * @author leiduanchn
 * @create 2019-12-06 10:53 a.m.
 */
public class PrototypeFactoryTest {

    public static void main(String[] args) {
        String[] names = {"tom", "harry", "dick", "lucy"};
        if(names.length > 0){
            for (String name : names) {
                Person prototype = Factory.getPrototype(name);
                if(prototype != null){
                    System.out.println(prototype);
                }
            }

        }else {
            System.out.println("Run again with arguments of command string ");
        }
    }
}
