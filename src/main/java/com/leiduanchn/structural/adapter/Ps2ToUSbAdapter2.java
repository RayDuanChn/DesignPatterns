package com.leiduanchn.structural.adapter;

/**
 * 适配器 (对象适配器方式,使用了组合的方式跟被适配对象整合)  (相当于usb和ps/2的转接器)
 * @author leiduanchn
 * @create 2019-12-16 10:56 a.m.
 */
public class Ps2ToUSbAdapter2 implements Adapter {

    private KeyBoard keyBoard;

    public Ps2ToUSbAdapter2() {
    }

    public Ps2ToUSbAdapter2(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    @Override
    public void convertPs2ToUSb() {
        keyBoard.type();
        System.out.println("convert2 to usb");
    }
}
