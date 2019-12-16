package com.leiduanchn.structural.adapter;

/**
 * @author leiduanchn
 * @create 2019-12-16 10:54 a.m.
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Adapter adapter = new Ps2ToUSbAdapter();
        computer.typeByUsb(adapter);


        Adapter adapter2 = new Ps2ToUSbAdapter2(new KeyBoard());
        computer.typeByUsb(adapter2);
    }
}
