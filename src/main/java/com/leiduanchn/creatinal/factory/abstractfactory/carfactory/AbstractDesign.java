package com.leiduanchn.creatinal.factory.abstractfactory.carfactory;

/**
 * @author leiduanchn
 * @create 2019-12-19 10:15 a.m.
 */


/*
    Let’s take an example, Suppose we want to build a global car factory. If it was factory design pattern,
    then it was suitable for a single location. But for this pattern, we need multiple locations and some critical design changes.

    We need car factories in each location like IndiaCarFactory, USACarFactory and DefaultCarFactory.
    Now, our application should be smart enough to identify the location where it is being used,
    so we should be able to use appropriate car factory without even knowing which car factory implementation will be used internally.
    This also saves us from someone calling wrong factory for a particular location.

    Here we need another layer of abstraction which will identify the location and internally use correct car factory implementation
    without even giving a single hint to user. This is exactly the problem, which abstract factory pattern is used to solve.


    Difficult to support new kind of products: Extending abstract factories to produce new kinds of Products isn’t easy.
    That’s because the AbstractFactory interface fixes the set of products that can be created.
    Supporting new kinds of products requires extending the factory interface, which involves changing the AbstractFactory class
    and all of its subclasses.
    For example , in this case, there are model and location as products, if add brand product, we need to change the AbstractFactory class
    and all of its subclasses.

 */
public class AbstractDesign {

    public static void main(String[] args)
    {
        System.out.println(CarFactory.buildCar(CarType.MICRO));
        System.out.println(CarFactory.buildCar(CarType.MINI));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
