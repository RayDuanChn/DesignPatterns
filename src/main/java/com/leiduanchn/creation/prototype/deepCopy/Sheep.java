package com.leiduanchn.creation.prototype.deepCopy;

import java.io.Serializable;
import java.util.Date;

/**
 * deep copy of prototype pattern by clone method
 * @author leiduanchn
 * @create 2019-12-06 9:57 a.m.
 */
public class Sheep implements Cloneable, Serializable {

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
        Object obj = super.clone();     //直接调用object对象的clone()方法！

        //添加如下代码实现深复制(deep Clone)
        Sheep sheep = (Sheep) obj;
        sheep.setBirth((Date) this.birth.clone()); //把属性也进行克隆！
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
