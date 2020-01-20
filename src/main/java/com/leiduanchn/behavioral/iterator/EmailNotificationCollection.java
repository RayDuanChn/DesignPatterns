package com.leiduanchn.behavioral.iterator;

/**
 * @author leiduanchn
 * @create 2020-01-20 11:22 a.m.
 */
public class EmailNotificationCollection implements Collection {

    Notification[] notifications;

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;

    public EmailNotificationCollection()
    {
        notifications = new Notification[MAX_ITEMS];

        // Let us add some dummy notifications
        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    private void addItem(String msg) {
        Notification notification = new Notification(msg);
        if(numberOfItems >= MAX_ITEMS){
            System.err.println("Full");
        }else {
            notifications[numberOfItems] = notification;
            numberOfItems += 1;
        }

    }


    @Override
    public Iterator createIterator() {
        return new EmailNotificationIterator(notifications);
    }
}
