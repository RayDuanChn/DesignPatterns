package com.leiduanchn.creatinal.prototype.shallowCopy;

import java.text.ParseException;
import java.util.Date;

/**
 * Test prototype shallow copy
 * @author leiduanchn
 * @create 2019-12-06 9:35 a.m.
 */
public class ShallowCopyTest {

    public static void main(String[] args) throws CloneNotSupportedException, ParseException {

        //Sheep tomSheep = new Sheep("Tom", new SimpleDateFormat().parse("2019-10-10"));
        Date date = new Date(234234345L);
        Sheep tomSheep = new Sheep("Tom", date);
        Sheep cloneSheep = (Sheep) tomSheep.clone();

        System.out.println(tomSheep.toString());
        System.out.println(cloneSheep.toString());

        //shallow copy,  change the value of object, all is changed
        date.setTime(4576452342L);

        System.out.println(tomSheep.toString());
        System.out.println(cloneSheep.toString());
    }
}
