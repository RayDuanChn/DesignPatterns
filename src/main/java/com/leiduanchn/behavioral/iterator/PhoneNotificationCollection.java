package com.leiduanchn.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leiduanchn
 * @create 2020-01-20 11:28 a.m.
 */
public class PhoneNotificationCollection implements Collection{

    List<Notification> notificationList;

    public PhoneNotificationCollection() {
        notificationList = new ArrayList<>();
        addItem("Notification 4");
        addItem("Notification 5");
        addItem("Notification 6");
    }

    private void addItem(String msg) {
        Notification notification = new Notification(msg);
        notificationList.add(notification);
    }

    @Override
    public Iterator createIterator() {
        return new PhoneNotificationIterator(notificationList);
    }
}
