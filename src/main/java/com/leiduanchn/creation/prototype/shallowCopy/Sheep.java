package com.leiduanchn.creation.prototype.shallowCopy;

import java.util.Date;

/**
 * 浅拷贝
 * @author leiduanchn
 * @create 2019-12-06 9:31 a.m.
 */
public class Sheep implements Cloneable{

    private String name;

    private Date birth;

    public Sheep() {
    }

    public Sheep(String name, Date birth) {
        this.name = name;
        this.birth = birth;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}


