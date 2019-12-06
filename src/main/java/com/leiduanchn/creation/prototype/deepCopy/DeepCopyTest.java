package com.leiduanchn.creation.prototype.deepCopy;

;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author leiduanchn
 * @create 2019-12-06 10:01 a.m.
 */
public class DeepCopyTest {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = sdf.parse("2019-10-10 11:48:27");
        System.out.println(sdf.format(date));
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
