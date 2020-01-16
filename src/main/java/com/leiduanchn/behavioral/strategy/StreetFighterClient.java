package com.leiduanchn.behavioral.strategy;

/**
 * @author leiduanchn
 * @create 2020-01-16 2:58 p.m.
 */

/**
 * 1. the strategy pattern enables an algorithm’s behavior to be selected at runtime. The strategy pattern
 * defines a family of algorithms,
 * encapsulates each algorithm, and
 * makes the algorithms interchangeable within that family.”
 * 2. 策略模式：分别封装行为接口，实现算法族，超类里放行为接口对象，在子类里具体设定行为对象。
 *    原则就是：分离变化部分，封装接口，基于接口编程各种功能。此模式让行为的变化独立于算法的使用者
 * 3. Advantages:
 *  - A family of algorithms can be defined as a class hierarchy and can be used interchangeably to alter application behavior without changing its architecture.
 *  - By encapsulating the algorithm separately, new algorithms complying with the same interface can be easily introduced.
 *  - The application can switch strategies at run-time.
 *  - Strategy enables the clients to choose the required algorithm, without using a “switch” statement or a series of “if-else” statements.
 *  - Data structures used for implementing the algorithm are completely encapsulated in Strategy classes. Therefore, the implementation of an algorithm can be changed without affecting the Context class.
 *
 * 4. 策略模式在JDK-Arrays 应用
 *   1) JDK的 Arrays 的Comparator就使用了策略模式
 *
 */
public class StreetFighterClient {

    public static void main(String[] args) {
        JumpBehavior shortJump = new ShortJump();
        JumpBehavior LongJump = new LongJump();
        KickBehavior tornadoKick = new TornadoKick();

        // Make a fighter with desired behaviors
        Fighter ken = new Ken(shortJump, tornadoKick);
        ken.display();
        // Test behaviors
        ken.punch();
        ken.kick();
        ken.jump();

        // Change behavior dynamically
        ken.setJumpBehavior(LongJump);
        ken.jump();
    }
}
