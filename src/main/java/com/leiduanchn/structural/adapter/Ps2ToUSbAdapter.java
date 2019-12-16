package com.leiduanchn.structural.adapter;

/**
 * 适配器 (类适配器方式)  (相当于usb和ps/2的转接器
 * @author leiduanchn
 * @create 2019-12-13 12:51 p.m.
 */
public class Ps2ToUSbAdapter extends KeyBoard implements Adapter {

    @Override
    public void convertPs2ToUSb() {
        super.type();
        System.out.println("convert to usb");
    }
}

