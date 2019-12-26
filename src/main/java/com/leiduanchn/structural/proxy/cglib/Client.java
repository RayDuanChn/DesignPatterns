package com.leiduanchn.structural.proxy.cglib;

/**
 * @author leiduanchn
 * @create 2019-12-25 3:36 p.m.
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //创建目标对象
        RealInternet target = new RealInternet();
        //获取到代理对象，并且将目标对象传递给代理对象
        RealInternet proxyInstance = (RealInternet) new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法，触发 intercept 方法，从而实现 对目标对象的调用
        proxyInstance.connectTo("www.abc.com");

    }
}
