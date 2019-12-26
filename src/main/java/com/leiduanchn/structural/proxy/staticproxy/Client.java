package com.leiduanchn.structural.proxy.staticproxy;

/**
 * @author leiduanchn
 * @create 2019-12-25 3:36 p.m.
 */
public class Client {
    public static void main(String[] args) {

        Internet internet = new InternetProxy();

        //通过代理对象，调用到被代理对象的方法
        //即：执行的是代理对象的方法，代理对象再去调用目标对象的方法
        try {
            internet.connectTo("geeksforgeeks.org");
            internet.connectTo("abc.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
