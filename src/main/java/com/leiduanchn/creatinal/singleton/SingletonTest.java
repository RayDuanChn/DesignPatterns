package com.leiduanchn.creatinal.singleton;


/**
 * @author leiduanchn
 * @create 2019-11-28 2:54 p.m.
 */
public class SingletonTest {

    public static void main(String[] args) {
        Singleton01 instance1 = Singleton01.getInstance();
        Singleton01 instance2 = Singleton01.getInstance();

        System.out.println(instance1 == instance2);


        Singleton02 instance3 = Singleton02.getInstance();
        Singleton02 instance4 = Singleton02.getInstance();

        System.out.println(instance3 == instance4);

        Singleton04 instance5 = Singleton04.getInstance();
        Singleton04 instance6 = Singleton04.getInstance();

        System.out.println(instance5 == instance6);


        Singleton06 instance7 = Singleton06.getInstance();
        Singleton06 instance8 = Singleton06.getInstance();

        System.out.println(instance7 == instance8);

        Singleton07 instance9 = Singleton07.INSTANCE;
        Singleton07 instance10 = Singleton07.INSTANCE;

        System.out.println(instance9 == instance10);
    }
}

/**
 * Singleton 饿汉式（静态常量）， 可以用
 * 步骤如下：
 * 1) 构造器私有化 (防止 new )
 * 2) 类的内部创建对象
 * 3) 向外暴露一个静态的公共方法。 getInstance
 *
 *
 * 优点：
 * 1. 简单
 * 2. 基于 classloder 机制避免了多线程的同步问题，线程安全
 * 缺点：
 * 1. 没有达到Lazy Loading的效果
 *
 */
class Singleton01{
    //1) 构造器私有化 (防止 new )
    private Singleton01(){}

    //2) 类的内部创建对象
    private final static Singleton01 instance = new Singleton01();

    //3) 向外暴露一个静态的公共方法。 getInstance
    public static Singleton01 getInstance(){
        return instance;
    }

}

/**
 * 饿汉式（静态代码块）， 可以用
 * 优缺点和静态常量一样
 */
class Singleton02{
    //1) 构造器私有化 (防止 new )
    private Singleton02(){}

    //2) 类的内部创建对象
    private final static Singleton02 instance;

    static {
        instance = new Singleton02();
    }


    //3) 向外暴露一个静态的公共方法。 getInstance
    public static Singleton02 getInstance(){
        return instance;
    }
}

/**
 * 懒汉式(线程不安全)，不可用
 *
 * 1. 线程不安全，实际开发中不能使用
 * 2. Lazy Loading的效果
 */
class Singleton03{

    private Singleton03(){};

    private static Singleton03 instance;

    // 当使用该对象时才创建， 称为懒汉式 lazy load
    public static Singleton03 getInstance(){
        if(instance == null){
            instance = new Singleton03();
        }
        return instance;
    }

}

/**
 * 懒汉式(线程安全，同步方法) . 不推荐使用
 *
 * 1. 解决了线程不安全问题
 * 2. 效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
 * 3. 在实际开发中， 不推荐使用这种方式
 */
class Singleton04 {

    private Singleton04(){};

    private static Singleton04 instance;

    // use synchronized to solve thread security
    public static synchronized Singleton04 getInstance(){
        if(instance == null){
            instance = new Singleton04();
        }
        return instance;
    }

}

/**
 * 双重检查(线程安全，同步代码块) ， 推荐使用
 * 线程安全；延迟加载；效率较高
 * 结论：在实际开发中，推荐使用这种单例设计模式
 *
 */
class Singleton05{
    private Singleton05(){};

    // use volatile
    private volatile static Singleton05 instance;

    /*
    volatile作用：以下会涉及到Java内存模型的知识

    1. 禁止指令重排序。我们知道new Singleton()是一个非原子操作，编译器可能会重排序
    【构造函数可能在整个对象初始化完成前执行完毕，即赋值操作（只是在内存中开辟一片存储区域后直接返回内存的引用）在初始化对象前完成】。
    而线程B在线程A赋值完时判断instance就不为null了(第一个if(instance == null)位置判断)，此时B拿到的将是一个没有初始化完成的半成品。

    2. 保证可见性。线程A在自己的工作线程内创建了实例，但此时还未同步到主存中；此时线程B在主存中判断instance还是null，
    那么线程B又将在自己的工作线程中创建一个实例，这样就创建了多个实例。

    顺便提一下，volatile禁止指令重排序只能保证volatile修饰的代码之后的代码不会在它之前执行。


    假设没有关键字volatile的情况下，
        两个线程A、B，都是第一次调用该单例方法，线程A先执行instance = new Instance()，
        该构造方法是一个非原子操作，编译后生成多条字节码指令，由于JAVA的指令重排序，可能会先执行instance的赋值操作，
        该操作实际只是在内存中开辟一片存储对象的区域后直接返回内存的引用，之后instance便不为空了，但是实际的初始化操作却还没有执行
        如果就在此时线程B进入，就会看到一个不为空的但是不完整（没有完成初始化）的Instance对象，
        所以需要加入volatile关键字，禁止指令重排序优化，从而安全的实现单例。

        创建对象可以分解为如下的3行伪代码memory=allocate();
            //1:分配对象的内存空间ctorInstance(memory);
            //2:初始化对象instance=memory;
            //3:设置instance指向刚分配的内存地址上面3行代码中的2和3之间，可能会被重排序导致先3后2

     */
    public static Singleton05 getInstance(){

        if(instance == null){

            synchronized (Singleton05.class) {
                // use double check
                if(instance == null) {
                    instance = new Singleton05();
                }
            }
        }
        return instance;
    }
}

/**
 * 静态内部类方式 ，推荐使用
 * 1) 采用了类装载的机制来保证线程安全。
 * 2) 实现lazy load ，静态内部类方式在 Singleton类被装载时并不会立即实例化，而是在调用getInstance方法时，
 *      才会装载SingletonInstance类，从而完成Singleton的实例化。
 * 3) 优点：
 *      避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
 * 5) 结论：推荐使用.
 *
 */
class Singleton06{
    private Singleton06(){};

    //静态内部类，包含一个静态属性 Singleton06
    private static class SingletonInstance{
        private final static Singleton06 INSTANCE = new Singleton06();
    }

    public static Singleton06 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}

/**
 * 枚举 （推荐）
 * 借助枚举类实现了线程安全，而且能防止反序列化重新创建新的对象.
 * Effective Java 中推荐使用
 */
enum Singleton07{
    INSTANCE; //属性
}



