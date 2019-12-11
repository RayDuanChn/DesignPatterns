package com.leiduanchn.creation.objectpool;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author leiduanchn
 * @create 2019-12-11 11:57 a.m.
 */


/*
    Intent
        Object pooling can offer a significant performance boost; it is most effective in situations
        where the cost of initializing a class instance is high, the rate of instantiation of a class is high,
        and the number of instantiations in use at any one time is low.

    Check list
        1 Create ObjectPool class with private array of Objects inside
        2 Create acquire and release methods in ObjectPool class
        3 Make sure that your ObjectPool is Singleton

    Rules of thumb
        1 The Factory Method pattern can be used to encapsulate the creation logic for objects.
            However, it does not manage them after their creation, the object pool pattern keeps track of the objects it creates.
        2 Object Pools are usually implemented as Singletons.

        https://sourcemaking.com/design_patterns/object_pool
 */
public abstract class ObjectPool<T> {

    //expiration time in the object pool
    private long expirationTime;

    //Save the object being used
    private Hashtable<T, Long> locked;

    //Save idle objects
    private Hashtable<T, Long> unlocked;

    public ObjectPool() {
        this.expirationTime = 30000;  //30 seconds
        this.locked = new Hashtable<>();
        this.unlocked = new Hashtable<>();
    }

    /**
     * create new object
     */
    protected abstract T create();

    /**
     * verify whether object exist or close
     */
    protected abstract boolean validate(T t);

    /**
     * Clean or close the object
     */
    protected abstract void dead(T t);


    public synchronized T checkOut() {
        long now = System.currentTimeMillis();
        T t;

        //objects available
        if (unlocked.size() > 0) {
            Enumeration<T> e = unlocked.keys();
            t = e.nextElement();
            if ((now - unlocked.get(t)) > expirationTime) {
                // object has expired
                unlocked.remove(t);
                dead(t);
                t = null;
            } else {
                if (validate(t)) {
                    unlocked.remove(t);
                    locked.put(t, now);
                    return t;
                } else {
                    // object failed validation
                    unlocked.remove(t);
                    dead(t);
                    t = null;
                }
            }
        }

        // no objects available, create a new one
        t = create();
        locked.put(t, now);
        return t;
    }

    public synchronized void checkIn(T t){
        locked.remove(t);
        //put into available pool and refresh time
        unlocked.put(t, System.currentTimeMillis());
    }

}
