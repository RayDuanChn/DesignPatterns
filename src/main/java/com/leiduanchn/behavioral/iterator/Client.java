package com.leiduanchn.behavioral.iterator;

import java.util.ArrayList;

/**
 * The iterator pattern provides a way to access the elements of an aggregate object without exposing its underlying representation.
 *
 * 1. Here we have a common interface Aggregate for client as it decouples it from the implementation of your collection of objects.
 * 2. The ConcreteAggregate implements createIterator() that returns iterator for its collection. Each ConcreteAggregate’s responsibility is to instantiate a ConcreteIterator
 *      that can iterate over its collection of objects.
 * 3. The iterator interface provides a set of methods for traversing or modifying the collection that is in addition to next()/hasNext()
 *      it can also provide functions for search, remove etc.
 *
 * @author leiduanchn
 * @create 2020-01-20 11:55 a.m.
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<Collection> collections = new ArrayList<>();
        collections.add(new EmailNotificationCollection());
        collections.add(new PhoneNotificationCollection());

        NotificationBar nb = new NotificationBar(collections);
        nb.printNotifications();
    }
}
