package com.leiduanchn.structural.proxy.dynamicproxy;


/**
 * @author leiduanchn
 * @create 2019-12-25 3:36 p.m.
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        Internet realInternet = new RealInternet();
        //给目标对象，创建代理对象
        Internet proxyInstance = (Internet)new ProxyFactory(realInternet).getProxyInstance();

        try {
            //通过代理对象，调用目标对象的方法
            proxyInstance.connectTo("geeksforgeeks.org");
            proxyInstance.connectTo("abc.com");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
