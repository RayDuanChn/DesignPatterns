package com.leiduanchn.structural.proxy.staticproxy;

/**
 * 被代理对象
 *
 * @author leiduanchn
 * @create 2019-12-25 3:31 p.m.
 */
public class RealInternet implements Internet {

    @Override
    public void connectTo(String serverhost) throws Exception {
        System.out.println("Connecting to "+ serverhost);
    }
}
