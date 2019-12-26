package com.leiduanchn.structural.proxy.cglib;



/**
 * 被代理对象
 *
 * @author leiduanchn
 * @create 2019-12-25 3:31 p.m.
 */
public class RealInternet {

    public void connectTo(String serverhost) throws Exception {
        System.out.println("Connecting to "+ serverhost + " ，我是cglib代理，不需要实现接口");
    }
}
