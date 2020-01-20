package com.leiduanchn.behavioral.iterator;

import java.util.List;

/**
 * @author leiduanchn
 * @create 2020-01-20 11:14 a.m.
 */
public class PhoneNotificationIterator implements Iterator{

    // PhoneNotificationIterator is held by List
    List<Notification> notificationList;

    int index = -1;//索引

    public PhoneNotificationIterator(List<Notification> notificationList) {
        this.notificationList = notificationList;
    }

    //判断list中还有没有下一个元素, 注意必须先hasNext()然后才能 next()到下一个元素， 有严格的顺序
    @Override
    public boolean hasNext() {
        if(index >= notificationList.size() - 1){
            return false;
        }else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return notificationList.get(index);
    }
}
