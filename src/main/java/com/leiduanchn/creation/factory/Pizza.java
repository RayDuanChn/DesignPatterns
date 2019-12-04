package com.leiduanchn.creation.factory;

/**
 * @author leiduanchn
 * @create 2019-12-03 11:32 a.m.
 */
public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    public void bake(){
        System.out.println(name + " bake..");
    };

    public void cut(){
        System.out.println(name + " cut..");
    };

    public void box(){
        System.out.println(name + " box..");
    };

    public void setName(String name) {
        this.name = name;
    }
}
