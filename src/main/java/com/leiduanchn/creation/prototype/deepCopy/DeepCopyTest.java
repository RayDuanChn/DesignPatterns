package com.leiduanchn.creation.prototype.deepCopy;

;
import java.util.Date;

/**
 * @author leiduanchn
 * @create 2019-12-06 10:01 a.m.
 */
public class DeepCopyTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        //Sheep tomSheep = new Sheep("Tom", new SimpleDateFormat().parse("2019-10-10"));
        Date date = new Date(234234345L);
        Sheep tomSheep = new Sheep("Tom", date);
        //Sheep cloneSheep = (Sheep) tomSheep.clone();
        Sheep cloneSheep = DeepCoyBySerialization.clone(tomSheep);

        System.out.println(tomSheep.toString());
        System.out.println(cloneSheep.toString());

        //deep copy,  change the value of object
        date.setTime(4576452342L);

        System.out.println(tomSheep.toString());
        System.out.println(cloneSheep.toString());

        /*
        Sheep{name='Tom', birth=Sat Jan 03 12:03:54 EST 1970}
        Sheep{name='Tom', birth=Sat Jan 03 12:03:54 EST 1970}
        Sheep{name='Tom', birth=Sun Feb 22 18:14:12 EST 1970}
        Sheep{name='Tom', birth=Sat Jan 03 12:03:54 EST 1970}
         */



    }
}
