package com.leiduanchn.behavioral.iterator;

/**
 * @author leiduanchn
 * @create 2020-01-20 11:01 a.m.
 */

public class EmailNotificationIterator implements Iterator {

    // EmailNotification is held by Array
    Notification[] notifications;

    // maintains curr pos of iterator over the array
    int pos = 0;

    // Constructor takes the array of notifications are going to iterate over.
    public EmailNotificationIterator(Notification[] notifications) {
        this.notifications = notifications;
    }

    @Override
    public boolean hasNext() {
        if(pos >= notifications.length || notifications[pos] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        // return next element in the array and increment pos
        Notification notification = notifications[pos];
        pos += 1;
        return notification;
    }
}
