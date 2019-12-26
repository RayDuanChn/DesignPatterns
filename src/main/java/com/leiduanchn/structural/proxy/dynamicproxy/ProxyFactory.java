package com.leiduanchn.structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理工厂
 *
 * @author leiduanchn
 * @create 2019-12-25 3:57 p.m.
 */
public class ProxyFactory {

    //维护一个目标对象 , Object
    private Object obj;
    //构造器 ， 对target 进行初始化
    public ProxyFactory(Object obj) {
        this.obj = obj;
    }

    //给目标对象 生成一个代理对象
    public Object getProxyInstance(){
		/*
		  public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)

            //1. ClassLoader loader ： 指定当前目标对象使用的类加载器, 获取加载器的方法固定
            //2. Class<?>[] interfaces: 目标对象实现的接口类型，使用泛型方法确认类型
            //3. InvocationHandler h : 事情处理，执行目标对象的方法时，会触发事情处理器方法, 会把当前执行的目标对象方法作为参数传入
		 */

        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK dynamic proxy start ~~");
                //反射机制调用目标对象的方法
                Object returnVal = method.invoke(obj, args);

                System.out.println("JDK dynamic proxy end ~~");
                return returnVal;
            }
        };

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), invocationHandler);
    }

}
