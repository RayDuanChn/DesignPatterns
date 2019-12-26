package com.leiduanchn.structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Cglib代理
 *  静态代理和 JDK代理模式都要求目标对象是实现一个接口,但是有时候目标对象并没有实现任何的接口,
 *  这个时候可使用目标对象子类来实现代理-这就是Cglib代理
 *
 * 1. 目标对象需要实现接口， 用JDK代理
 * 2. 目标对象不需要实现接口， 用Cglib代理
 *
 * 步骤“
 * 1) 需要引入cglib的jar文件
 * 2) 在内存中动态构建子类， 注意代理的类不能为final，否则报错 java.lang.IllegalArgumentException:
 * 3) 目标对象的方法如果为 final/static,那么就不会被拦截,即不会执行目标对象额外的业务方法
 *
 * @author leiduanchn
 * @create 2019-12-25 3:57 p.m.
 */
public class ProxyFactory implements MethodInterceptor {

    //维护一个目标对象 , Object
    private Object target;
    //构造器 ， 对target 进行初始化
    public ProxyFactory(Object obj) {
        this.target = obj;
    }

    //返回一个代理对象:  是 target 对象的代理对象
    public Object getProxyInstance() {
        //1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2. 设置父类
        enhancer.setSuperclass(target.getClass());
        //3. 设置回调函数
        enhancer.setCallback(this);

        //4. 创建子类对象，即代理对象
        return enhancer.create();
    }

    //重写  intercept 方法，会调用目标对象的方法
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("Cglib代理模式 ~~ 开始");
        Object returnVal = method.invoke(target, args);
        System.out.println("Cglib代理模式 ~~ 提交");
        return returnVal;
    }
}
