package com.leiduanchn.behavioral.chain;

/**
 * @author leiduanchn
 * @create 2020-02-07 1:37 p.m.
 */
public abstract class Approver {

    Approver nextApprover;  //下一个处理者
    String name; // 名字

    public Approver(String name) {
        this.name = name;
    }

    //下一个处理者
    public void setApprover(Approver approver) {
        this.nextApprover = approver;
    }

    //处理审批请求的方法，得到一个请求, 处理是子类完成，因此该方法做成抽象
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
