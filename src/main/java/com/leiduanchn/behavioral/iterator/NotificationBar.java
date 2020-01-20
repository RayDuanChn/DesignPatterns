package com.leiduanchn.behavioral.iterator;

import java.util.List;

/**
 * @author leiduanchn
 * @create 2020-01-20 11:32 a.m.
 */
// Contains collection of notifications as an object of NotificationCollection
public class NotificationBar {

    private List<Collection> notificationCollections;

    public NotificationBar(List<Collection> notificationCollections) {
        this.notificationCollections = notificationCollections;
    }


    public void printNotifications()
    {
        for (Collection notificationCollection : notificationCollections) {
            Iterator iterator = notificationCollection.createIterator();
            System.out.println("-------NOTIFICATION BAR------------");
            while (iterator.hasNext())
            {
                Notification n = (Notification)iterator.next();
                System.out.println(n.getNotification());
            }
        }

    }
}
